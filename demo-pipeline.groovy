def githubUrl = "https://github.com/hin22001/jenkins-pipeline.git"


pipelineJob("Demo") {
  definition {
    cps {
      script(readFileFromWorkspace('demo.groovy'))
      sandbox()
    }
  }
}
