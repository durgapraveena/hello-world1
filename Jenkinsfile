pipeline {
    agent any

    stages {
    stage('checkout') {
            steps {
                git 'https://github.com/abhic137/hello-world-jenkins.git'
            }
        }
    stage('build') {
            steps {
                sh "mvn clean install"
            }
        }
    stage('test') {
            steps {
                sh "mvn test"
            }
        }
    stage('deploy') {
            steps {
                deploy adapters: [tomcat8(credentialsId: 'tomcat', path: '', url: 'http://192.168.138.130:8081/')], contextPath: null, war: '**/*.war'
            }
        }  
    }
    
}
