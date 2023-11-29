pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                git credentialsId: '8e09c309-e3af-4ca0-8abd-1542b79a3cb9', url: 'https://github.com/sixisixixi/spring-boot-examples.git'
                echo 'pull code success'
            }
        }
        stage('build project') {
            steps {
                sh 'cd ${WORKSPACE}/springboot && mvn clean package'
                echo 'build project success'
            }
        }
        stage('publish project') {
            steps {
                sh '''cd /Users/ts-junyao.luo/data/project/multi-branch
                cp ${WORKSPACE}/springboot/target/*.jar  /Users/ts-junyao.luo/data/project/multi-branch/springboot.jar
                cp ${WORKSPACE}/springboot/Dockerfile  /Users/ts-junyao.luo/data/project/multi-branch
                docker build -t test1 -f Dockerfile .
                docker run -d -p 8888:8081 --name springboot1 test1'''
                echo 'publish project success'
            }
        }

    }
}
