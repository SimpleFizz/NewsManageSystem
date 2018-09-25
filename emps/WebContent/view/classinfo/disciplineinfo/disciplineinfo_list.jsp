<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
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
 <ul class="breadcrumb" style="  margin:0px;" >
    	<li><a href="#">班级管理</a></li>
        <li>学科信息</li>
    </ul>
</div>
<form class="form-inline">
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >

     <div class="form-group">
         <label class="" for="activename">学科名称：</label>
        <input type="text" class="form-control" id="disciplineNameId" placeholder="请输入">
      </div>		
				
    <input type="button"   class="btn btn-danger"  onclick="findByName();"  value="查询"/>
    <a  class="btn btn-success"  href="${pageContext.request.contextPath }/view/classinfo/disciplineinfo/disciplineinfo_add.jsp">添加学科信息</a>
    
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
	<table class="table  table-condensed table-striped">
    	<tr>
        	<th>编号</th>
            <th>学科名称</th>
            <th>学科费用</th>
            <th>学科课时</th>

            <th>操作</th>
        </tr>
        
        <c:forEach items="${requestScope.disciplineInfolist}" var="disciplineInfo" > 
       <%-- <c:forEach  items="${requestScope.roleInfoList }" var="roleInfo"> --%>
      	 <tr>
        	<td>${disciplineInfo.disciplineId}</td>
            <td>${disciplineInfo.disciplineName}</td>
            <td>${disciplineInfo.disciplineTuition}</td>
            <td>${disciplineInfo.disciplineBring}</td>
    
           <th><a href="${pageContext.request.contextPath }/DisciplineController/updateUi.action?disciplineId=${disciplineInfo.disciplineId}">修改</a> 
            <a href="javaScript:void(0);"  onclick="deleteById(${disciplineInfo.disciplineId });">删除</a></th> 
            
            </tr>
        
        </c:forEach> 
     	                    
    </table>
</div>
</form>
</body>
	<script type="text/javascript">
		function findByName(){
			var disciplineName = $("#disciplineNameId").val();
			location.href ="${pageContext.request.contextPath}/DisciplineController/findByName.action?disciplineName="+disciplineName ;
		}
		
		function deleteById(disciplineId){
			if(confirm("是否确定删除")){
				location.href="${pageContext.request.contextPath}/DisciplineController/deleteById.action?disciplineId="+disciplineId ;
			}
		}
		
		
	</script>
</html>