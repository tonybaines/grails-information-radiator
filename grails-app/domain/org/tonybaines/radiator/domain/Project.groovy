package org.tonybaines.radiator.domain

class Project {
	String name
	static hasMany = [modules:Module]

    static constraints = {
    }
}
