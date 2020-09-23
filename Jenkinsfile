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
  def command = "./gradlew ${args.join(' ')} -s"
  shell(command)
}

// fix windows shell wahala
def shell(String command) {
   if (isUnix()) {
    sh command
  } else {
    bat command
  }
}
