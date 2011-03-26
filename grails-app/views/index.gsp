<html>
    <head>
        <title>Information Radiator</title>
        <link rel="stylesheet" href="${resource(dir:'css',file:'informationRadiator.css')}" />
        <g:javascript library="jquery" plugin="jquery"/>
        <jqui:resources/>
        <g:javascript src="informationRadiator.js"/>
        <g:javascript src="jquery.layout/jquery.layout.min-1.2.0.js"/>
        <script type="text/javascript">
        $(document).ready(function() {
        	$('body').layout({ applyDefaultStyles: false, closable: false, spacing_open: 20 });
        	getJenkinsBuilds('http://store:8080/job/Test-narc');
        });
        </script>
    </head>
    <body>
		    <div id="jobs" class="ui-layout-north">
		    	<table border="1">
		    		<tr>
		    			<!-- Dummy content -->
		    			<th>Projects:</th>
		    			<td><button class="projectPassed" disabled="disabled">Test-narc</button></td>
		    			<td><button class="projectPassed" disabled="disabled">Test-narc</button></td>
		    			<td><button class="projectFailed" disabled="disabled">Test-narc</button></td>
		    			<td><button class="projectPassed" disabled="disabled">Test-narc</button></td>
		    			<td><button class="projectPassed" disabled="disabled">Test-narc</button></td>
		    		</tr>
		    	</table>
		    </div>
			<div id="builds"class="ui-layout-west">
				<table id="buildList" class="builds" border="1"/>
			</div>
    </body>
</html>
