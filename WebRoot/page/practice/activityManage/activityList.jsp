<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap/css/bootstrap.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap/css/bootstrap-theme.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrapTable/bootstrap-table.css" />

<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/css/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/css/bootstrapTable/bootstrap-table.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/css/bootstrapTable/bootstrap-table-locale-all.js"></script>


<script type="text/javascript" src="${pageContext.request.contextPath }/js/json3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common.js"></script>
<script type="text/javascript" src="activityList.js"></script>
<script type="text/javascript">
</script>
<title>活动查询</title>
</head>
<body>

<div class="container-fluid">
  <div class="page-header">
    <h1>活动查询<small>列表页面</small></h1>
  </div>
  <div class="row">
  	<div class="col-sm-8 col-sm-offset-2">
      <form>
        <input type="hidden" id="id" name="id" />
	    <div class="form-group col-sm-6">
			<label class="col-sm-2" for="actiName">活动名称：</label>
			<div class="col-sm-10"><input type="text" class="form-control" id="actiName" name="actiName" placeholder="input"></div>
		</div>
		<div class="form-group col-sm-6">
			<label class="col-sm-2" for="actiAddr">活动地址：</label>
			<div class="col-sm-10"><input type="text" class="form-control" id="actiAddr" name="actiAddr" placeholder="input"></div>
		</div>
		<div class="form-group col-sm-6">
			<label class="col-sm-2" for="actiAge">活动actiAge：</label>
			<div class="col-sm-10"><input type="text" class="form-control" id="actiAge" name="actiAge" placeholder="input"></div>
		</div>
		<div class="form-group col-sm-6">
			<label class="col-sm-2" for="actiStarttime">活动actiStarttime：</label>
			<div class="col-sm-10"><input type="text" class="form-control" id="actiStarttime" name="actiStarttime" placeholder="input"></div>
		</div>
		<div class="form-group col-sm-6">
			<label class="col-sm-2" for="actiEndtime">活动actiEndtime：</label>
			<div class="col-sm-10"><input type="text" class="form-control" id="actiEndtime" name="actiEndtime" placeholder="input"></div>
		</div>
		<div class="form-group col-sm-6">
			<label class="col-sm-2" for="actiShipdate">活动actiShipdate：</label>
			<div class="col-sm-10"><input type="text" class="form-control" id="actiShipdate" name="actiShipdate" placeholder="input"></div>
		</div>
		<div class="form-group col-sm-6">
			<label class="col-sm-2" for="actiParentchildInd">活动actiParentchildInd：</label>
			<div class="col-sm-10"><input type="text" class="form-control" id="actiParentchildInd" name="actiParentchildInd" placeholder="input"></div>
		</div>
		<div class="form-group col-sm-6">
			<label class="col-sm-2" for="actiFeatureDesc">活动actiFeatureDesc：</label>
			<div class="col-sm-10"><input type="text" class="form-control" id="actiFeatureDesc" name="actiFeatureDesc" placeholder="input"></div>
		</div>
		<div class="form-group col-sm-6">
			<label class="col-sm-2" for="actiPrice">活动actiPrice：</label>
			<div class="col-sm-10"><input type="text" class="form-control" id="actiPrice" name="actiPrice" placeholder="input"></div>
		</div>
		<div class="form-group col-sm-6">
			<label class="col-sm-2" for="actiAbsPic">活动actiAbsPic：</label>
			<div class="col-sm-10"><input type="file" class="form-control" id="actiAbsPic" name="actiAbsPic" placeholder="file"></div>
		</div>
	    <button type="submit" id="QueryBtn" class="btn btn-default">查询</button>
	    <button type="submit" id="ResetBtn" class="btn btn-default">重置</button>
	</form>
	</div>
  </div>
  <div class="page-header">
    <h1>活动查询<small>列表结果</small></h1>
  </div>
  <div class="row">
  	<div class="col-sm-8 col-sm-offset-2">
  	
  		<div id="toolbar" class="btn-group">
            <button id="btn_add" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
            </button>
            <button id="btn_edit" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
            </button>
            <button id="btn_delete" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
            </button>
        </div>
  		<table class="table table-striped" id="QueryResultTable">
  			
		</table>
	</div>
  </div>
</div>

</body>

</html>