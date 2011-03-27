package org.tonybaines.radiator.domain

class Module {
	String name
	String vcsUrl
	static belongsTo = [project:Project]
	static hasMany = [builds:Build]

    static constraints = {
    }
}
