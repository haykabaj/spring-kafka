pipeline {
    agent any

    environment {
        JAVA_HOME = tool 'JDK 17'
    }

    stages {
        stage('Build') {

                steps {
                       bat './gradlew clean build'
            }
        }
    }

    post {
        always {
            echo 'Этот блок выполнится всегда'
        }
        success {
            echo 'Этот блок выполнится только в случае успешного завершения'
        }
        failure {
            echo 'Этот блок выполнится только в случае ошибки'
        }
    }
}