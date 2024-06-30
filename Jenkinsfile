pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Замените путь на ваш полный путь к jar файлу
                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\java.exe" -jar "полный_путь_к_вашему_файлу\\your-application.jar"'
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