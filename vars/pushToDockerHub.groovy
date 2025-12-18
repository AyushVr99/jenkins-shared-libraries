def pushToDockerHub(
    String imageName,
    String tag = 'latest',
    String credentialsId
) {
    echo "Pushing image to Docker Hub"

    withCredentials([usernamePassword(
        credentialsId: credentialsId,
        usernameVariable: 'dockerHubUser',
        passwordVariable: 'dockerHubPass'
    )]) {
        sh """
          echo "\$dockerHubPass" | docker login -u "\$dockerHubUser" --password-stdin
          docker tag ${imageName}:${tag} "\$dockerHubUser/${imageName}:${tag}"
          docker push "\$dockerHubUser/${imageName}:${tag}"
        """
    }
}
