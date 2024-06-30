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
}