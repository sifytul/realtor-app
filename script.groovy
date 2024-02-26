def buildApp() {
    echo 'building...'
    withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
        sh 'docker build -t sifytul/demo-app:realtor-2.0 .'
        sh 'echo $PASSWORD | docker login -u $USERNAME --password-stdin'
        sh 'docker push sifytul/demo-app:realtor-2.0'
    }
}

def testApp() {
    echo 'testing...'
}

def deployApp() {
    echo 'deploying...'
}

return this
