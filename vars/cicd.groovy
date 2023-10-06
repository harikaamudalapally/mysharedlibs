def newGit(repo)
{
  git "https://github.com/harikaamudalapally/${repo}"
}

def newBuild()
{
  sh 'mvn package'
}

