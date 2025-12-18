def call(String repoUrl, String branch = 'main') {
    echo "Cloning repo: ${repoUrl} (branch: ${branch})"
    git branch: branch, url: repoUrl
    echo "Repository cloned successfully"
}
