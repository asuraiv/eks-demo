import java.text.SimpleDateFormat

node {
	stage('Src Checkout') {
		git 'https://github.com/asuraiv/eks-demo.git'
	}

	stage('Test') {
		sh './gradlew bootJar'
	}

  	stage('Build') {
  		sh './gradlew bootJar'
  	}

  	stage('Docker build') {
		def timestamp = new SimpleDateFormat('yyyyMMddHHmmss').format(new Date())
	  	stamped = docker.build("eks-demo:${timestamp}")
	  	latest = docker.build('eks-demo:latest')
  	}

  	stage('ECR push') {
		docker.withRegistry('http://444716303806.dkr.ecr.ap-northeast-2.amazonaws.com/eks-demo', 'ecr:ap-northeast-2:demo-ecr-credentials') {
			stamped.push()
			latest.push()
		}
  	}
}