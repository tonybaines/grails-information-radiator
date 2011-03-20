# Jenkins builds API parsing
def project = new XmlSlurper().parse("http://store:8080/job/Test-narc/api/xml")
println project.displayName.text()
project.build.each {
  def build = new XmlSlurper().parse(it.url.text()+"/api/xml")
  println "Number: ${build.number.text()}, Date: ${build.id.text()}, Duration: ${build.duration.text()}, Status: ${build.result.text()}"
}
