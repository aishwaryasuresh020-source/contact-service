pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t contact-service .'
            }
        }

        stage('Run') {
            steps {
                sh 'docker run -d -p 8087:8080 contact-service'
            }
        }
    }
}
