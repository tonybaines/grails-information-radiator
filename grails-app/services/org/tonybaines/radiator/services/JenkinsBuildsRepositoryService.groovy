package org.tonybaines.radiator.services

import java.text.DateFormat

import org.tonybaines.radiator.domain.Build

class JenkinsBuildsRepositoryService {

    static transactional = false

    def buildsFor(url) {
		def project = new XmlSlurper().parse("$url/api/xml")
		project.build[1..10].collect {
		  def build = new XmlSlurper().parse(it.url.text()+"/api/xml")
		  Build.fromStringValues(
			  label: build.number.text(),
			  date: build.id.text(),
			  durationMs: build.duration.text(),
			  status: build.result.text()
		  )
		}
    }
}
