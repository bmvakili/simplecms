/*
* This is an example using YUI framework
* You can adapt this to other JS frameworks
* Though key to remember is to prefix the 
* parameter name with:
*      simpleCMS.namespace
* and to call the Resource phase of the
* SimpleCMS portlet by calling the URL:
*      simpleCMS.disptacherURL
* regardless of the JS framework you're using.
* Which is most likely AngularJS and/or similar
* JS frameworks.
*/

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