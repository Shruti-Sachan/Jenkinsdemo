pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from your version control system
                git 'https://github.com/Shruti-Sachan/Jenkinsdemo.git'
            }
        }
        stage('Build') {
            steps {
                // Build your project using Maven
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Run your tests
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Deploy your application
                sh 'cp sampleProject/target/sampleProject-0.0.1-SNAPSHOT.jar ./sampleProject/target'
            }
        }
    }

    post {
        success {
            // If the pipeline execution is successful, you may want to trigger some notifications or cleanup tasks
            echo 'Pipeline succeeded! You may want to notify the team.'
        }
        failure {
            // If the pipeline fails, you may want to send notifications or perform some cleanup tasks
            echo 'Pipeline failed! You may want to notify the team or rollback any changes.'
        }
    }
}
