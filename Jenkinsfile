pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        gradlew('assembleDebug')
      }
    }
  }
}

def gradlew(String... args) {
    bat "./gradlew ${args.join(' ')} -s"
}
