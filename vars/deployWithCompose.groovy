def deployWithCompose() {
    echo "Deploying application using Docker Compose"
    sh '''
      docker compose down || true
      docker compose up -d
    '''
}
