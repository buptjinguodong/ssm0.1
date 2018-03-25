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

<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/css/bootstrap/js/bootstrap.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath }/js/json3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common.js"></script>
<script type="text/javascript" src="activityDetail.js"></script>
<script type="text/javascript">
</script>
<title>活动详情</title>
</head>
<body>

<div class="container-fluid">
  <div class="row">
    <form>
      <input type="hidden" id="id" name="id" />
	    <div class="form-group">
			<label for="actiName">活动名称：</label>
			<input type="text" class="form-control" id="actiName" name="actiName" placeholder="input">
		</div>
		<div class="form-group">
			<label for="actiAddr">活动地址：</label>
			<input type="text" class="form-control" id="actiAddr" name="actiAddr" placeholder="input">
		</div>
		<div class="form-group">
			<label for="actiAge">活动actiAge：</label>
			<input type="text" class="form-control" id="actiAge" name="actiAge" placeholder="input">
		</div>
		<div class="form-group">
			<label for="actiStarttime">活动actiStarttime：</label>
			<input type="text" class="form-control" id="actiStarttime" name="actiStarttime" placeholder="input">
		</div>
		<div class="form-group">
			<label for="actiEndtime">活动actiEndtime：</label>
			<input type="text" class="form-control" id="actiEndtime" name="actiEndtime" placeholder="input">
		</div>
		<div class="form-group">
			<label for="actiShipdate">活动actiShipdate：</label>
			<input type="text" class="form-control" id="actiShipdate" name="actiShipdate" placeholder="input">
		</div>
		<div class="form-group">
			<label for="actiParentchildInd">活动actiParentchildInd：</label>
			<input type="text" class="form-control" id="actiParentchildInd" name="actiParentchildInd" placeholder="input">
		</div>
		<div class="form-group">
			<label for="actiFeatureDesc">活动actiFeatureDesc：</label>
			<input type="text" class="form-control" id="actiFeatureDesc" name="actiFeatureDesc" placeholder="input">
		</div>
		<div class="form-group">
			<label for="actiPrice">活动actiPrice：</label>
			<input type="text" class="form-control" id="actiPrice" name="actiPrice" placeholder="input">
		</div>
		<div class="form-group">
			<label for="actiAbsPic">活动actiAbsPic：</label>
			<input type="file" class="form-control" id="actiAbsPic" name="actiAbsPic" placeholder="file">
		</div>
	  <button type="submit" id="EnsureBtn" class="btn btn-default">Submit</button>
	</form>
  </div>
</div>

</body>

</html>