pipeline {
    agent any
    stages {
        stage('build') {
            echo 'building...'
        }

        stage('test') {
            when {
                expression {
                    true
                }
            }

            steps {
                echo 'testing...'
            }
        }

        stage('deploy') {
            steps {
                echo 'deploying...'
            }
        }
    }

    post {
        always {
            echo 'always executed...'
        }
    }
}