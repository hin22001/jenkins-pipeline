def githubUrl = "https://github.com/hin22001/jenkins-pipeline.git"

pipelineJob("Demo") {
  definition {
    cpsScm {
      scm {
        git{
          remote {
            url("${githubUrl}")
          }
            branch("*/main")
        }
      }
    }
  }
}
