package org.tonybaines.radiator.domain

import grails.plugin.spock.UnitSpec;
import grails.test.*


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
		   num  |          dateTime          | duration | status
		   "1"  | "2011-02-15 22:01:35 +0000"| "100"    | "SUCCESS"
		   "2"  | "2011-02-15 22:01:35 +0001"| "100"    | "FAILURE"
	}
	
}
