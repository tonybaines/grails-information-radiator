package org.tonybaines.radiator.domain

import java.util.Date;
import java.util.Map;

class Build {
	String label
	Date date
	Boolean passed
	Long durationMs
	String vcsUrl
	static belongsTo = [module:Module]
	
	static constraints = {
		vcsUrl(nullable: true)	
	}
	
	static Build fromStringValues(Map props) {
		new Build(label: props.label,
			date: new Date().parse('yyyy-MM-dd_HH-mm-ss', props.date),
			durationMs: props.durationMs.toLong(),
			passed: ("SUCCESS" == props.status) ? true : false
		   )
	}
}
