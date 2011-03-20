package org.tonybaines.radiator.controllers

import grails.plugin.spock.ControllerSpec
import org.tonybaines.radiator.domain.Build

class JenkinsBuildsControllerSpec extends ControllerSpec {
	def "requesting a list of builds"() {
		given:
		 def timestamp = new Date()
		 def stubService = [
			 buildsFor: {url ->
				 [new Build("1", timestamp, true, 1000L)]
	         }
		 ]
		 controller.jenkinsBuildsRepositoryService = stubService
		when:
		 controller.index()
		then:
		 mockResponse.contentAsString == """
[
  {
    "class": "org.tonybaines.radiator.domain.Build",
    "date": "${timestamp.format("yyyy-MM-dd'T'HH:mm:ss'Z'")}",
    "durationMs": 1000,
    "label": "1",
    "passed": true
  }
]"""
	}
}
