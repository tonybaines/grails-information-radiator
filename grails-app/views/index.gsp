<html>
    <head>
        <title>Information Radiator</title>

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
        	layout();
        });
        </script>
    </head>
    <body>
    	<div class="container">
		    <div id="jobs">
    			<!-- Dummy content -->
    			<button class="projectPassed" disabled="disabled">Project-1</button>
    			<button class="projectPassed" disabled="disabled">Project-2</button>
    			<button class="projectFailed" disabled="disabled">Project-3</button>
    			<button class="projectPassed" disabled="disabled">Project-4</button>
    			<button class="projectPassed" disabled="disabled">Project-5</button>
	    		<hr/>
		    </div>
			<div id="builds" />
			<div id="main">
				Main content goes here
			</div>
			<div id="commits">
				<p>10 dhjskhfkdsjhflks</p>
				<p>12 fjdskl;jfldkszjlds</p>
			</div>
			<div id="motd">
				<p>Message of the day ...</p>
			</div>
		</div>
    </body>
</html>
