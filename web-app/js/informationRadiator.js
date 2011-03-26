/**
 * 
 */
function getJenkinsBuilds(jobUri) {
    $.get('jenkinsBuilds?jobUri='+jobUri, function(data) {
    	$('#buildList').html('<tbody/>')
    	$(data).each( function( ind, build ) {
    	      $('#buildList > tbody:last').append('<tr class="'+classForBuildStatus(build.passed)+'">'+
	        	      '<td>'+build.label+'</td>'+
	        	      '<td>'+build.date+'</td>'+
	        	      '<td>'+build.passed+'</td>'+
	        	      '<td>'+build.durationMs+'</td>'+
	          '</tr>');
    	    } );
    });
}
function classForBuildStatus(status) {
	if (status) return 'buildPassed'
	else return 'buildFailed';
}