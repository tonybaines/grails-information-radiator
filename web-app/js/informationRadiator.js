function getJenkinsBuilds(jobUri) {
    $.get('jenkinsBuilds?jobUri='+jobUri, assembleBuildList);
}

var assembleBuildList = function(data) {
	var builds = $('#builds')
	$(data).each( function( ind, build ) {
	     builds.append('<button class="'+classForBuildStatus(build.passed)+'" disabled="disabled">Build '+build.label+'</button>');
	    } );
	$('button').button();
}

function classForBuildStatus(status) {
	return status ? 'buildPassed' : 'buildFailed';
}