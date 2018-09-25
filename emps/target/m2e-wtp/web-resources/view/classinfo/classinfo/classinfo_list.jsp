<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>

<body>
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li><a href="#">班级管理</a></li>
        <li>班级信息</li>
    </ul>
</div>
<form class="form-inline">
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >

     <div class="form-group">
         <label class="" for="activename">班级名称：</label>
        <input type="email" class="form-control" id="classNameId" placeholder="请输入班级名称">
      </div>

    <input type="button"   class="btn btn-danger"   onclick="findByName();"    value="查询"/>
    <a  class="btn btn-success"  href="${pageContext.request.contextPath}/ClassController/addClass.action">添加班级</a>
    
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
	<table class="table  table-condensed table-striped">
    	<tr>
        	<th>编号</th>
            <th>班级名称</th>
            <th>班级人数</th>
            <th>开班日期</th>
            <th>结束日期</th>
            <th>班级名称</th>
            <th>操作</th>
        </tr>
     
         <c:forEach items="${requestScope.ClassInfoList}" var= "classInfo">
		<tr>
			<td>${classInfo.classId}</td> 
			<td>${classInfo.className}</td> 
			<td>${classInfo.classNumber}</td> 
			<td>${classInfo.classStartTime}</td> 
			<td>${classInfo.classEndTime}</td> 
			<td>${classInfo.classroomInfo.classroomName}</td> 
			
			<th>
				<a href="${pageContext.request.contextPath}/ClassController/updateUi.action?classId=${classInfo.classId}">修改</a>
				<a href="javaScript:void(0);" onclick="deleteById(${classInfo.classId});">删除</a>
			</th>
		 </tr>  
	</c:forEach>                  
     	                   
    </table>
</div>
</form>
</body>

<script type="text/javascript">
		function findByName(){
			var className = $("#classNameId").val();
			location.href="${pageContext.request.contextPath}/ClassController/findByName.action?className="+className;
			
		}
		
		function deleteById(classId){
			if(confirm("是否确定删除")){
				location.href="${pageContext.request.contextPath}/ClassController/deleteById.action?classId="+classId;
			}
			
		}
		

	</script>
</html>
