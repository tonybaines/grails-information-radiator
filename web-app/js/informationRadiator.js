/**
 * 
 */
function getJenkinsBuilds(jobUri) {
    $.get('jenkinsBuilds?jobUri='+jobUri, function(data) {
    	$('#buildList').html('<tbody/>').append('<tr><th>Builds</th></tr>')
    	$(data).each( function( ind, build ) {
    	      $('#buildList > tbody:last').append('<tr>'+
	        	      '<button class="'+classForBuildStatus(build.passed)+'" disabled="disabled">Build '+build.label+'</button>'+
	          '</tr>');
    	    } );
    	$('button').button();
    });
}
function classForBuildStatus(status) {
	return status ? 'buildPassed' : 'buildFailed';
}