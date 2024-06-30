pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Команда для сборки проекта с помощью Gradle
                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\java.exe" -version'
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