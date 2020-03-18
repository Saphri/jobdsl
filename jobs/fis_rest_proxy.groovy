pipelineJob('fis-rest-proxy') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/Saphri/fis-rest-proxy.git')
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}