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
        <li>教师管理</li>
    </ul>
</div>
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >
<form class="form-inline">

    <div class="form-group">
         <label class="" for="activename">条件：</label>
     
        	<select class="form-control  input-sm" id="findMethod">
        	<option value="byName">姓名</option>
            <option value="byGender">性别</option>
        </select>
            <input type="text" id="methodValue" class="form-control input-sm"/>
      </div>
  
    <input type="button"   class="btn btn-danger"   value="查询"  onclick="findByMethod();" />
    <input type="button"   class="btn btn-success"   value="添加" onClick="javascript:window.location='${pageContext.request.contextPath }/view/classinfo/teacher/teacher_add.jsp'"/>
    </form>
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
	<table class="table  table-condensed table-striped">
    	<tr>
        	<th>教师编号</th>
            <th>教师姓名</th>
            <th>教师性别</th>
            <th>教师年龄</th>
            <th>电话号码</th>
            <th>QQ</th>
            <th>入职时间</th>
             <th>操作</th>
        </tr>
	 <c:forEach items="${requestScope.TeacherInfoList }" var="teacherInfo">
        <tr>
        	<td>${teacherInfo.staffId }</td>
            <td>${teacherInfo.staffName }</td>
            <td>${teacherInfo.staffSex }</td>
            <td>${teacherInfo.staffAge }</td>
            <td>${teacherInfo.staffMobilePhone }</td>
            <td>${teacherInfo.staffQq }</td>
            <td>${teacherInfo.staffEntryTime }  </td>
            <td>
            	<a  href="${pageContext.request.contextPath }/TeacherController/staffinfoUpdateUi.action?staffId=${teacherInfo.staffId  }">修改</a>
                <a  href="javaScript:void(0);" onclick="deleteById(${teacherInfo.staffId })">删除</a>
            </td>
        </tr>   
        </c:forEach>

    </table>
</div>

</body>

<script type="text/javascript">
   function findByMethod() {
	/*  var method = $("#findMethod").val();
	 var methodValue = $("#methodValue").val();
	 if(method == "byName"){
		 location.href="${pageContext.request.contextPath }/RoleController/findByMethod.action?staffName="+methodValue;
	 }else if(method == "byGender"){
		 location.href="${pageContext.request.contextPath }/RoleController/findByMethod.action?staffSex="+methodValue;
	 } */
	 
	 var method = $("#findMethod").val();
	 var methodValue =$("#methodValue").val();
	 if(method == "byName"){
		 location.href="${pageContext.request.contextPath }/TeacherController/findByMethod.action?staffName="+methodValue ;
	 }
	 else if(method = "byGender"){
		 location.href ="${pageContext.request.contextPath }/TeacherController/findByMethod.action?staffSex="+methodValue ;
	 }
	 
   }	 
	 
	

	   function deleteById(id) {
		 if(confirm("是否进行删除？")){
			 location.href="${pageContext.request.contextPath }/TeacherController/deleteStaffInfoById.action?staffId="+id;
		 }
	}


	 

</script>
</html>
