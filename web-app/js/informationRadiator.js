function getJenkinsBuilds(jobUri) {
    $.get('jenkinsBuilds?jobUri='+jobUri, assembleBuildList);
}

var assembleBuildList = function(data) {
	var builds = $('table#buildList.builds').html('<tbody/>').append('<tr><th>Builds</th></tr>')
	$(data).each( function( ind, build ) {
	     builds.append('<tr><td>'+'<button class="'+classForBuildStatus(build.passed)+'" disabled="disabled">Build '+build.label+'</button>'+
          '</td></tr>');
	    } );
	$('button').button();
}

function classForBuildStatus(status) {
	return status ? 'buildPassed' : 'buildFailed';
}