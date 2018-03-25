var nav={};
a="个人评价：热爱编程，8年的编程经历让我对编程懂得了更多；热爱团体，多年的工作让我明白，一个优秀的团队是多么伟大；";

nav.initAction = function(){
	var thisVar = this;
	var jsonData = {};
	thisVar.initActionOut(jsonData);
};
nav.initActionOut = function(jsonData){
	var thisVar = this;
	thisVar.jsonData = jsonData;
	// 外呼请求API，itemList
	Common.post({
		fw_url:"/cmfnav/navQuery.action",
		contentType:"application/json;charset=utf-8",
		data:JSON.stringify(jsonData),
		success:function(data){
			thisVar.initActionSucc(data);
		}
	});
};
nav.initActionSucc = function(data){
	var thisVar = this;
	var temStr = "";
	for(var key in data){
		var record = data[key];
		var temLine = "<li><a href='#'>" + record["label"] + "</a></li>";
		temStr = temStr + temLine;
	}
	$("#nav_ul").append(temStr);
	
};
nav.init = function(){
	var thisVar = this;
	thisVar.initAction();
};

nav.init();