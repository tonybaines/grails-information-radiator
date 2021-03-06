package org.tonybaines.radiator.controllers

import grails.converters.JSON
import org.tonybaines.radiator.domain.Error

class JenkinsBuildsController {
	def jenkinsBuildsRepositoryService
	static defaultAction = "list"

	def list = {
		def jobUri = params.jobUri
		response.contentType="text/json"
		if (jobUri) render jenkinsBuildsRepositoryService.lastTenBuildsFor(jobUri) as JSON
		else render new Error(status: 400, message: "'jobUri' parameter expected").encodeAsJSON()
	}
}
