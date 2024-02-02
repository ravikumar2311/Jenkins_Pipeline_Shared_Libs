def call(Map config) {
    node {
      echo "${config.message}"
      bat '''
        git version
        java -version
        mvn -version
      '''
    }
}
