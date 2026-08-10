pipeline {

    agent any

    tools {

        jdk 'JDK17'

        maven 'Maven3'
    }


    stages {


        stage('Checkout') {

            steps {

                checkout scm
            }
        }


        stage('Build') {

            steps {

                sh 'mvn clean compile'
            }
        }


        stage('Test') {

            steps {

                sh 'mvn test'
            }
        }


        stage('Verify') {

            steps {

                sh 'mvn verify'
            }
        }


        stage('Package') {

            steps {

                sh 'mvn package -DskipTests'
            }
        }


    }


    post {

        always {

            junit testResults:
                'target/surefire-reports/*.xml',
                allowEmptyResults: true
        }


        success {

            archiveArtifacts(
                artifacts: 'target/*.jar',
                fingerprint: true
            )

            echo 'BUILD SUCCESS'
        }


        failure {

            echo 'BUILD FAILED'
        }
    }
}
