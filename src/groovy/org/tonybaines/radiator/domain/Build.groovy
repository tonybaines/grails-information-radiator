package org.tonybaines.radiator.domain

@Immutable final class Build {
	String label
	Date date
	Boolean passed
	Long durationMs

	static Build fromStringValues(Map props) {
		new Build(label: props.label,
			date: new Date().parse('yyyy-MM-dd_HH-mm-ss', props.date),
			durationMs: props.durationMs.toLong(),
			passed: ("SUCCESS" == props.status) ? true : false
		   )
	}	
}
