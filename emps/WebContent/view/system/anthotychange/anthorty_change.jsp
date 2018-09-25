<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
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
<form action="${pageContext.request.contextPath }/AnthortyController/anthortyChange.action" class="form-horizontal"  method="post">

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">角色编号</label>
            	<input  type="hidden"  name="roleId" value="${requestScope.roleInfo.roleId }">
                <div class="col-sm-9">
                	<p class="form-control-static">${requestScope.roleInfo.roleId }</p>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">角色名称</label>
                <div class="col-sm-9">
                	<p class="form-control-static">${requestScope.roleInfo.roleName }</p>
                </div>
            </div>
        </div>

    </div>
  <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">菜单信息</h5> 
  <table class="table">
  	<tr>
    	<th>一级菜单</th>
        <th>二三...级菜单</th>
    </tr>
    <c:forEach  items="${requestScope.dtoList }" var="dto">
       <tr>
    	<td>
        	<label class="checkbox-inline">
            	<input type="checkbox" name="anthortyId" value="${dto.anth.anthortyId }" ${dto.anth.checked ?"checked":"" }>${dto.anth.anthortyName }
             </label>
        </td>
    	<td>
    	    <c:forEach items="${dto.list }" var="child">
    	        <label class="checkbox-inline">
            	<input type="checkbox" value="${child.anthortyId }" name="anthortyId" ${child.checked ?"checked":"" }>${child.anthortyName }
             </label>
    	    </c:forEach>
        </td>
    </tr>
    </c:forEach>
  
  </table>   
       	<div class="row">
    	<div class="col-sm-5 col-sm-offset-4">
          	<input type="submit" class="btn btn-success" value="权限变更"/>
            <a  href="anthorty_changelist.html" class="btn btn-warning">返回上一级</a>
          
        </div>
    </div>
    
</form>        
</div>
</body>
</html>
    