def call() {
  node {
      bat '''
        git version
        java -version
        mvn -version
      '''
  }
}
