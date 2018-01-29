import jenkins.model.*

def instance  = Jenkins.getInstance()
def plugins   = ["git", "ssh-slaves", "workflow-aggregator", "github-pullrequest"]

pluginManager = instance.getPluginManager()
updateCenter = instance.getUpdateCenter()

updateCenter.updateAllSites()

def enablePlugin(pluginName) {
  if (! pluginManager.getPlugin(pluginName)) {
    deployment = updateCenter.getPlugin(pluginName).deploy(true)
    deployment.get()
  }

  def plugin = pluginManager.getPlugin(pluginName)
  if (! plugin.isEnabled()) {
    plugin.enable()
  }

  plugin.getDependencies().each {
    enablePlugin(it.shortName)
  }
}

plugins.each {
  def plugin = pluginManager.getPlugin(it)
  enablePlugin(it)
}
