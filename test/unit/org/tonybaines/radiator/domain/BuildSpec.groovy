package org.tonybaines.radiator.domain

import grails.plugin.spock.UnitSpec


class BuildSpec extends UnitSpec {
	def "Constructing a Build from String parameters"() {
		expect:
		Build.fromStringValues(
			label: num,
			date: dateTime,
			durationMs: duration,
			passed: status
		)
		where:
		   num  |       dateTime       | duration | status
		   "1"  | "2011-01-02_11-17-25"| "100"    | "SUCCESS"
		   "2"  | "2011-01-02_11-17-28"| "100"    | "FAILURE"
	}
	
}
