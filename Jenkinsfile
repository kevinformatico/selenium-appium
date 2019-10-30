pipeline {
    agent any
    stages {

        stage('No impacto') {
            steps {
                bat 'mvn clean install'
            }
        }
    }

    post {
        always {
          archiveArtifacts(artifacts: 'target/', fingerprint: true)
          junit 'target/cucumber.xml'
          publishTestResults(serverAddress:'http://35.247.232.57:70', projectKey: 'FAL', filePath: 'target/cucumber-report/cucumber.json', format: 'Cucumber', autoCreateTestCases: false)
        }
    }

}