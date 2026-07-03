pipeline {

    agent any

    tools {
        jdk 'JDK25'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/cherukurivarshini16/CorporateWebsite.git'
            }
        }

        stage('Build') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'which docker'
sh 'docker --version'
sh 'docker build -t corporatewebsite:v1 .'
            }
        }

    }
}