function sendJson(){
	$.ajax({
		type:"post",
		url:"${pageContext.request.contextPath }/item/editItem_RequestJson.action",
		contentType:"application/json;charset=utf-8",
		data:'{"name":"测试商品","price":99.9}',
		success:function(data){
			alert(data);
		}
	});
}

itemList = {};


itemList.initAction = function(){
	var thisVar = this;
	var jsonData = {};
	thisVar.initActionOut(jsonData);
};
itemList.initActionOut = function(jsonData){
	var thisVar = this;
	thisVar.jsonData = jsonData;
	// 外呼请求API，itemList
	Common.post({
		fw_url:"/item/itemList_RequestJson.action",
		contentType:"application/json;charset=utf-8",
		data:JSON.stringify(jsonData),
		success:function(data){
			thisVar.initActionSucc(data);
		}
	});
};
itemList.initActionSucc = function(data){
	var thisVar = this;
	alert(JSON.stringify(data));
};
itemList.init = function(){
	var thisVar = this;
	thisVar.initAction();
};

$(document).ready(function(){
	itemList.init();
});