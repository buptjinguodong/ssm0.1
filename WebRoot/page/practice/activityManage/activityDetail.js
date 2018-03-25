activityDetail = {};


activityDetail.initDom = function(){
	var thisVar = this;
	$("#EnsureBtn").click(function(){
		thisVar.EnsureBtnAction();
		return false;
	});
	
	thisVar.actiName = $("#actiName");
	thisVar.actiAddr = $("#actiAddr");
	thisVar.actiAge = $("#actiAge");
	thisVar.actiStarttime = $("#actiStarttime");
	thisVar.actiEndtime = $("#actiEndtime");
	thisVar.actiShipdate = $("#actiShipdate");
	thisVar.actiParentchildInd = $("#actiParentchildInd");
	thisVar.actiFeatureDesc = $("#actiFeatureDesc");
	thisVar.actiPrice = $("#actiPrice");
	thisVar.actiAbsPic = $("#actiAbsPic");
};

activityDetail.initAction = function(){
	var thisVar = this;
	var jsonData = {
		svrTpcd:"01",
		id:"1"
	};
	thisVar.initActionOut(jsonData);
};
activityDetail.initActionOut = function(jsonData){
	var thisVar = this;
	thisVar.jsonData = jsonData;
	// 外呼请求API，activityDetail
	Common.post({
		fw_url:"/activity/editRecordJson.action",
		contentType:"application/json;charset=utf-8",
		data:JSON.stringify(jsonData),
		success:function(data){
			thisVar.initActionSucc(data);
		}
	});
};
activityDetail.initActionSucc = function(data){
	var thisVar = this;
//	alert(JSON.stringify(data));
	thisVar.actiName.val(data.actiName);
	thisVar.actiAddr.val(data.actiAddr);
	thisVar.actiAge.val(data.actiAge);
	thisVar.actiStarttime.val(data.actiStarttime);
	thisVar.actiEndtime.val(data.actiEndtime);
	thisVar.actiShipdate.val(data.actiShipdate);
	thisVar.actiParentchildInd.val(data.actiParentchildInd);
	thisVar.actiFeatureDesc.val(data.actiFeatureDesc);
	thisVar.actiPrice.val(data.actiPrice);
	thisVar.actiAbsPic.val(data.actiAbsPic);
};

activityDetail.EnsureBtnAction = function(){
	var thisVar = this;
	var jsonData = {
		svrTpcd:"02", //add
		actiName: thisVar.actiName.val(),
		actiAddr: thisVar.actiAddr.val(),
		actiAge: thisVar.actiAge.val(),
		actiStarttime: thisVar.actiStarttime.val(),
		actiEndtime: thisVar.actiEndtime.val(),
		actiShipdate: thisVar.actiShipdate.val(),
		actiParentchildInd: thisVar.actiParentchildInd.val(),
		actiFeatureDesc: thisVar.actiFeatureDesc.val(),
		actiPrice: thisVar.actiPrice.val(),
		actiAbsPic: thisVar.actiAbsPic.val()
	};
	thisVar.EnsureBtnActionOut(jsonData);
};
activityDetail.EnsureBtnActionOut = function(jsonData){
	var thisVar = this;
	thisVar.jsonData = jsonData;
	// 外呼请求API，activityDetail
	Common.post({
		fw_url:"/activity/editRecordJson.action",
		contentType:"application/json;charset=utf-8",
		data:JSON.stringify(jsonData),
		success:function(data){
			thisVar.EnsureBtnActionSucc(data);
		}
	});
};
activityDetail.EnsureBtnActionSucc = function(data){
	var thisVar = this;
	alert(JSON.stringify(data));
};


activityDetail.init = function(){
	var thisVar = this;
	thisVar.initDom();
	thisVar.initAction();
};

$(document).ready(function(){
	activityDetail.init();
});