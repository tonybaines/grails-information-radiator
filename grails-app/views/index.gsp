<html>
    <head>
        <title>Information Radiator</title>
        <link rel="stylesheet" href="${resource(dir:'css',file:'informationRadiator.css')}" />
        <g:javascript library="jquery" plugin="jquery"/>
        <g:javascript src="informationRadiator.js"/>
        <script type="text/javascript">
        $(document).ready(function() {
        	getJenkinsBuilds('http://store:8080/job/Test-narc');
        });
        </script>
    </head>
    <body>
		<div id="container">
			<div id="builds">
				<table id="buildList" border="1"/>
			</div>
		</div>
    </body>
</html>
