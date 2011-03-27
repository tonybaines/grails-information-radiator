<html>
    <head>
        <title>Information Radiator</title>
        <link rel="stylesheet" href="${resource(dir:'css',file:'informationRadiator.css')}" />
        <less:stylesheet name="informationRadiator" />
    	<less:scripts />
        
        <g:javascript library="jquery" plugin="jquery"/>
        <jqui:resources/>
        <g:javascript src="informationRadiator.js"/>
        <g:javascript src="jquery.layoutengine/jquery.layoutengine.min.js"/>
        <g:javascript src="layout.js"/>
        <script type="text/javascript">
        $(document).ready(function() {
        	getJenkinsBuilds('http://store:8080/job/Test-narc');
        	//layout();
        });
        </script>
    </head>
    <body>
		    <div id="jobs">
		    	<table>
		    		<tr>
		    			<!-- Dummy content -->
		    			<th>Projects</th>
		    			<td><button class="projectPassed" disabled="disabled">Project-1</button></td>
		    			<td><button class="projectPassed" disabled="disabled">Project-2</button></td>
		    			<td><button class="projectFailed" disabled="disabled">Project-3</button></td>
		    			<td><button class="projectPassed" disabled="disabled">Project-4</button></td>
		    			<td><button class="projectPassed" disabled="disabled">Project-5</button></td>
		    		</tr>
		    		<tr><td colspan="6"><hr/></td></tr>
		    	</table>
		    </div>
			<div id="builds">
				<table id="buildList" class="builds"/>
			</div>
    </body>
</html>
