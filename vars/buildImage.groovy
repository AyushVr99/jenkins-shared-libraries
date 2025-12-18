def buildDockerImage(String imageName, String tag = 'latest') {
    echo "Building Docker image: ${imageName}:${tag}"
    sh "docker build -t ${imageName}:${tag} ."
}
