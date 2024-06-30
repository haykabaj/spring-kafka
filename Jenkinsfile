pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Команды для сборки проекта
                sh './gradlew build' // Для проектов Gradle
            }
        }
    }

    post {
            always {
                // Действия, которые будут выполнены всегда, независимо от результата
                echo 'This will always run'
            }
            success {
                // Действия, которые будут выполнены при успешной сборке
                echo 'This will run only if successful'
            }
            failure {
                // Действия, которые будут выполнены при ошибке сборки
                echo 'This will run only if failed'
            }
        }
}