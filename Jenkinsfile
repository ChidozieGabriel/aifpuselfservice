pipeline {
  agent any
  stages {
    
    stage('Assemble') {
        steps {
            gradlew('assembleDebug')
        }
    }

  }
}

def gradlew(String... args) {
    sh "./gradlew ${args.join(' ')} -s"
}
