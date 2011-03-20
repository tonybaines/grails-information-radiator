package org.tonybaines.radiator.controllers

import grails.converters.JSON
import grails.plugin.spock.ControllerSpec

import org.tonybaines.radiator.domain.Build

class JenkinsBuildsControllerSpec extends ControllerSpec {
	def "requesting a list of builds from a specified Jenkins job URI"() {
		given:
		 def timestamp = new Date()
		 def stubService = [
			 buildsFor: {url ->
				 [new Build("1", timestamp, true, 1000L)]
	         }
		 ]
		 controller.jenkinsBuildsRepositoryService = stubService
		 controller.params.jobUri="http://blah.blah"
		when:
		 controller.list()
		then:
		 def result = JSON.parse(mockResponse.contentAsString)
		 result[0].label == "1"
		 result[0].durationMs == 1000L
		 result[0].passed == true
	}
	
}
