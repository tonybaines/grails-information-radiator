package org.tonybaines.radiator.controllers

import grails.converters.JSON

class JenkinsBuildsController {
	def jenkinsBuildsRepositoryService

    def index = {
		def builds = jenkinsBuildsRepositoryService.buildsFor("http://store:8080/job/Test-narc")
		JSON.use("deep") {
			def converter = builds as JSON
			converter.prettyPrint = true
			converter.render(response)
		} 
	}
}
