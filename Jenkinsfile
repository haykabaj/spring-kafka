pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Замените путь на ваш полный путь к jar файлу
                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\java.exe" -jar "C:\\Users\\hayka\\IdeaProjects\\spring-kafka\\build\\libs\\spring-kafka-0.0.1-SNAPSHOT.jar"'
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