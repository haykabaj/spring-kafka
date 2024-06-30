pipeline {
    agent any

    environment {
        JAVA_HOME = tool 'JDK 17'
    }

    stages {
        stage('Build') {
            steps {
                script {
                    // Используем JAVA_HOME для выполнения команд Java
                    bat "${JAVA_HOME}\\bin\\java.exe -version"
                    bat "${JAVA_HOME}\\bin\\java.exe -jar \"C:\\Users\\hayka\\IdeaProjects\\spring-kafka\\build\\libs\\spring-kafka-0.0.1-SNAPSHOT.jar\""
                }
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