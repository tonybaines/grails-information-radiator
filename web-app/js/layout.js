function layout() {
	var layoutSettings = {
		Name : "Main",
		Dock : $.layoutEngine.DOCK.FILL,
		EleID : "main",
		Children : [ {
			Name : "Top",
			Dock : $.layoutEngine.DOCK.TOP,
			EleID : "jobs",
			Height : 60
		}, {
			Name : "Left",
			Dock : $.layoutEngine.DOCK.LEFT,
			EleID : "builds",
			Width : 100
		} ]
	};
	$.layoutEngine(layoutSettings);
}