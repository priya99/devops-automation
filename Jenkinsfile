pipeline {
    agent any

    tools{
        maven 'Maven'
    }
    stages{
        stage("Build Maven") { 
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/priya99/devops-automation']])
                bat 'mvn clean install'
            }
        }
        stage("Build docker image") { 
            steps{
                script{
                    bat 'docker build -t priyankadocker3/devops-integration .'
                }
            }
        }
        stage('Push image to Hub'){
             steps{
                script{
                   withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'hubpwd')]) {
                        bat 'docker login -u priyankadocker3 -p Priyanka@1993'
                    }
                    bat 'docker push priyankadocker3/devops-integration:latest'
                }
            }
        }
    }
}
