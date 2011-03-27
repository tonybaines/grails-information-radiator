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
		}, {
			Name : "Main",
			Dock : $.layoutEngine.DOCK.FILL,
			EleID : "main",
		}, {
			Name : "Right",
			Dock : $.layoutEngine.DOCK.RIGHT,
			EleID : "commits",
			Width : 200
		}, {
			Name : "Bottom",
			Dock : $.layoutEngine.DOCK.BOTTOM,
			EleID : "motd",
			Height : 60
		} ]
	};
	$.layoutEngine(layoutSettings);
}