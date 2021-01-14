node {
  stage 'Checkout'
  git 'https://github.com/asuraiv/eks-demo.git'

  stage 'App Build'
  sh './gradlew build'

  stage 'Docker build'
  docker.build('eks-demo')

  stage 'Docker push'
  docker.withRegistry('http://444716303806.dkr.ecr.ap-northeast-2.amazonaws.com/eks-demo', 'ecr:ap-northeast-2:demo-ecr-credentials') {
    docker.image('eks-demo').push('latest')
  }
}