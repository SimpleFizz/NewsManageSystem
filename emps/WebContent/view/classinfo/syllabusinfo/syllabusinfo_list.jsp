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
        <li>课程表</li>
    </ul>
</div>
<form class="form-inline">
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >

     <div class="form-group">
         <label class="" for="activename">课程表名称：</label>
        <input type="email" class="form-control" id="syllabusNameId" placeholder="请输入课程表名称">
      </div>

    <input type="button"   class="btn btn-danger"  onclick="findByName();"   value="查询"/>
    <a  class="btn btn-success"  href="${pageContext.request.contextPath}/view/classinfo/syllabusinfo/syllabusinfo_add.jsp">添加课程表</a>
    
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
	<table class="table  table-condensed table-striped">
    	<tr>
        	<th>编号</th>
            <th>课程表名称</th>
            <th>星期一</th>
            <th>星期二</th>
            <th>星期三</th>
            <th>星期四</th>
            <th>星期五</th>
            <th>星期六</th>
            <th>星期天</th>
            <th>操作</th>
        </tr>
              
	<c:forEach items="${requestScope.SyllabusInfoList}" var= "syllabusInfo">
		<tr>
			<td>${syllabusInfo.syllabusId}</td>
			<td>${syllabusInfo.syllabusName}</td>
			<td>${syllabusInfo.syllabusYi}</td>
			<td>${syllabusInfo.syllabusEr}</td>
			<td>${syllabusInfo.syllabusSan}</td>
			<td>${syllabusInfo.syllabusSi}</td>
			<td>${syllabusInfo.syllabusWu}</td>
			<td>${syllabusInfo.syllabusLiu}</td>
			<td>${syllabusInfo.syllabusQi}</td>
			
			<th>
				<a href="${pageContext.request.contextPath}/SyllabusController/updateUi.action?syllabusId=${syllabusInfo.syllabusId}">修改</a>
				<a href="javaScript:void(0);" onclick="deleteById(${syllabusInfo.syllabusId});">删除</a>
            
			</th>
			
			
		 </tr>  
	</c:forEach>          
     	                   
    </table>
</div>
</form>
</body>
	<script type="text/javascript">
		function findByName(){
			var syllabusName = $("#syllabusNameId").val();
			location.href="${pageContext.request.contextPath}/SyllabusController/findByName.action?syllabusName="+syllabusName;
			
		}
		
		
		
		function deleteById(syllabusId){
			if(confirm("是否确定删除")){
				location.href="${pageContext.request.contextPath}/SyllabusController/deleteById.action?syllabusId="+syllabusId;
			}
			
		}
				
	</script>
</html>
