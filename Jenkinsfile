import java.text.SimpleDateFormat

node {
  stage 'Checkout'
  git 'https://github.com/asuraiv/eks-demo.git'

  stage 'App Build'
  sh './gradlew build'

  stage 'Docker build'
  def timestamp = new SimpleDateFormat('yyyyMMddHHmmss').format(new Date())
  stamped = docker.build("eks-demo:${timestamp}")
  latest = docker.build('eks-demo:latest')

  stage 'Docker push'
  docker.withRegistry('http://444716303806.dkr.ecr.ap-northeast-2.amazonaws.com/eks-demo', 'ecr:ap-northeast-2:demo-ecr-credentials') {
  	stamped.push()
  	latest.push()
  }
}