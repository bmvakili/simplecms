YUI().use('node','io','event',
	function (Y) {
		var jsonObj = {
			cmd : "test",
			cmdParams : {
				"testParam" : "testValue",
				"testParam2" : "testValue2",
			}
		};
		var json = JSON.stringify(jsonObj);
		Y.io(
			simpleCMS.dispatcherURL,
		{
			method: "POST",
			data: simpleCMS.namespace + "json=" + json,
			on: {
			  success: function(event) {
			  	alert('ok');
			  }
			}
		});
});