pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\java.exe" -version' // Пример Windows-команды
                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\java.exe" -jar your-application.jar' // Пример команды для сборки проекта с Gradle
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