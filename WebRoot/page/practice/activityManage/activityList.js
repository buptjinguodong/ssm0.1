var globalVar = {};

activityList = {};

activityList.initDom = function(){
	var thisVar = this;
	$("#QueryBtn").click(function(){
		thisVar.QueryBtnAction();
		return false;
	});
	$("#ResetBtn").click(function(){
		thisVar.ResetBtnAction();

		return false;
	});

	var TableInit = function () {
	    var oTableInit = new Object();
	    //初始化Table
	    oTableInit.Init = function () {
	        $('#QueryResultTable').bootstrapTable({
	            url: '/ssm0716/activity/listRecordJson.action',         //请求后台的URL（*）
	            method: 'post',                      //请求方式（*）
	            toolbar: '#toolbar',                //工具按钮用哪个容器
	            striped: true,                      //是否显示行间隔色
	            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
	            pagination: true,                   //是否显示分页（*）
	            sortable: false,                     //是否启用排序
	            sortOrder: "asc",                   //排序方式
	            queryParams: oTableInit.queryParams,//传递参数（*）
	            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
	            pageNumber:1,                       //初始化加载第一页，默认第一页
	            pageSize: 10,                       //每页的记录行数（*）
	            pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
	            search: true,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
	            strictSearch: true,
	            showColumns: true,                  //是否显示所有的列
	            showRefresh: true,                  //是否显示刷新按钮
	            minimumCountColumns: 2,             //最少允许的列数
	            clickToSelect: true,                //是否启用点击选中行
	            height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
	            uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
	            showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
	            singleSelect: true,
	            cardView: false,                    //是否显示详细视图
	            detailView: false,                   //是否显示父子表
	            totalField: 'total',
	            dataField: 'list1',
	            columns: [{
	                checkbox: true
	            }, {
	                field: 'id',
	                title: '序号'
	            }, {
	                field: 'actiName',
	                title: '活动名称'
	            }, {
	                field: 'actiAddr',
	                title: '活动地点'
	            }, {
	                field: 'actiAge',
	                title: '活动年龄'
	            }, {
	                field: 'actiStarttime',
	                title: '报名开始时间'
	            }, {
	                field: 'actiEndtime',
	                title: '报名截止时间'
	            }, {
	                field: 'actiShipdate',
	                title: '活动出发日期'
	            }, {
	                field: 'actiParentchildInd',
	                title: '是否亲子'
	            }, {
	                field: 'actiFeatureDesc',
	                title: '活动特色说明'
	            }, {
	                field: 'actiPrice',
	                title: '活动价格'
	            }, {
	                field: 'actiAbsPic',
	                title: '摘要图片'
	            } ]
	        });
	    };

	    //得到查询的参数
	    oTableInit.queryParams = function (params) {
	        var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
	            limit: params.limit,   //页面大小
	            offset: params.offset,  //页码
	        };
	        return temp;
	    };
	    return oTableInit;
	};
	
	var oTable = new TableInit();
    oTable.Init();

	
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

activityList.initAction = function(){
	var thisVar = this;
	var jsonData = {
	};
	thisVar.initActionOut(jsonData);
};
activityList.initActionOut = function(jsonData){
	var thisVar = this;
	thisVar.jsonData = jsonData;
	// 外呼请求API，activityList
	Common.post({
		fw_url:"/activity/listRecordJson.action",
		contentType:"application/json;charset=utf-8",
		data:JSON.stringify(jsonData),
		success:function(data){
			thisVar.initActionSucc(data);
		}
	});
};
activityList.initActionSucc = function(data){
	var thisVar = this;
//	alert(JSON.stringify(data));
	// thisVar.actiName.val(data.actiName);
	// thisVar.actiAddr.val(data.actiAddr);
	// thisVar.actiAge.val(data.actiAge);
	// thisVar.actiStarttime.val(data.actiStarttime);
	// thisVar.actiEndtime.val(data.actiEndtime);
	// thisVar.actiShipdate.val(data.actiShipdate);
	// thisVar.actiParentchildInd.val(data.actiParentchildInd);
	// thisVar.actiFeatureDesc.val(data.actiFeatureDesc);
	// thisVar.actiPrice.val(data.actiPrice);
	// thisVar.actiAbsPic.val(data.actiAbsPic);
};

activityList.QueryBtnAction = function(){
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
	thisVar.QueryBtnActionOut(jsonData);
};
activityList.QueryBtnActionOut = function(jsonData){
	var thisVar = this;
	thisVar.jsonData = jsonData;
	// 外呼请求API，activityList
	Common.post({
		fw_url:"/activity/listRecordJson.action",
		contentType:"application/json;charset=utf-8",
		data:JSON.stringify(jsonData),
		success:function(data){
			thisVar.QueryBtnActionSucc(data);
		}
	});
};
activityList.QueryBtnActionSucc = function(data){
	var thisVar = this;
	alert(JSON.stringify(data));
};


activityList.init = function(){
	var thisVar = this;
	thisVar.initDom();
	thisVar.initAction();
};

$(document).ready(function(){
	activityList.init();
});