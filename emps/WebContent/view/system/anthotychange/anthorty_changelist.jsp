<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head> 
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
</head>

<body>
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li><a href="#">系统管理</a></li>
        <li>权限变更</li>
    </ul>
</div>
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >
<form class="form-horizontal">
	<div class="col-sm-2">角色名称:</div>
    <div class="col-sm-3">
    	<input type="text" id="roleName" class="form-control input-sm"/>
    </div>
    <input type="button"   class="btn btn-danger"  onclick="getByRoleName();"  value="查询"/>

    </form>
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
	<table class="table  table-condensed table-striped">
    	<tr>
        	<th>角色编号</th>
            <th>角色名称</th>
            <th>角色描述</th>
             <th>操作</th>
        </tr>
        <c:forEach items="${requestScope.roleList }" var="roleInfo">
           <tr>
        	<td>${roleInfo.roleId }</td>
            <td>${roleInfo.roleName }</td>
            <td>${roleInfo.roleDesc }</td>
            <th><a href="${pageContext.request.contextPath }/AnthortyController/anthortyChangeUi.action?roleId=${roleInfo.roleId }">权限变更</a></th>
        </tr> 
        </c:forEach>
       
    </table>
</div>

</body>
<script type="text/javascript">
   function getByRoleName() {
	  var roleName = $("#roleName").val();
	  location.href="${pageContext.request.contextPath }/AnthortyController/getByRoleName.action?roleName="+roleName;
}

</script>
</html>
    