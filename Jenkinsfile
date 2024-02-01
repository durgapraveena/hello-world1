pipeline {
    agent any

    stages {
    stage('checkout') {
            steps {
                git 'https://github.com/durgapraveena/hello-world1.git'
            }
        }
    stage('test') {
            steps {
                sh "mvn clean test"
            }
        }
    stage('build') {
            steps {
                sh "mvn install"
            }
        }
    stage('deploy') {
            steps {
                deploy adapters: [tomcat8(credentialsId: 'tomcat', path: '', url: 'http://192.168.138.130:8081/')], contextPath: null, war: '**/*.war'
            }
        }  
    }
    
}
