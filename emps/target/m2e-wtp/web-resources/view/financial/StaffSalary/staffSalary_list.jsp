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
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li><a href="#">财务管理</a></li>
        <li>员工薪水</li>
    </ul>
</div>
<form class="form-inline">
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >

     <div class="form-group">
         <label class="" for="activename">员工编号：</label>
        <input type="email" class="form-control" id="staffId" placeholder="请输入员工编号">
      </div>

    <input type="button"   class="btn btn-danger"  onclick="findByStaffId();"   value="查询"/>
    <a  class="btn btn-success"  href="${pageContext.request.contextPath}/view/financial/StaffSalary/staffSalary_add.jsp">添加员工薪水信息</a>
    
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
	<table class="table  table-condensed table-striped">
    	<tr>
        	<th>编号</th>
            <th>员工编号</th>
            <th>本月薪水</th>
            <th>扣除</th>
            <th>实际发放</th>
             <th>操作</th>
        </tr>
            <c:forEach items="${requestScope.page.getList()}" var= "staffSalaryInfo">
		<tr>
			<td>${staffSalaryInfo.staffSalaryId}</td> 
			<td>${staffSalaryInfo.staffId}</td> 
			<td>${staffSalaryInfo.totalSalary}</td> 
			<td>${staffSalaryInfo.deductSalary}</td> 
			<td>${staffSalaryInfo.realSalary}</td> 
			<th>
				<a href="${pageContext.request.contextPath}/StaffSalaryController/updateUi.action?staffSalaryId=${staffSalaryInfo.staffSalaryId}">修改</a>
				<a href="javaScript:void(0);" onclick="deleteById(${staffSalaryInfo.staffSalaryId});">删除</a>
            
			</th>
			
			
		 </tr>  
	</c:forEach>    
	
	<tfoot>
		<tr>
			<td>
				第${requestScope.page.pageNum}页
			</td>
			<td>
				<a href="${pageContext.request.contextPath}/StaffSalaryController/listStaffSalary.action?pageNum=${requestScope.page.pageNum-1}">        上一页</a> 
			</td>
			<td>
			<a href="${pageContext.request.contextPath}/StaffSalaryController/listStaffSalary.action?pageNum=${requestScope.page.pageNum+1}">      下一页</a>
			</td>
		
		</tr>
	</tfoot>      
     	                   
    </table>
</div>
</form>
</body>

<script>
	function findByStaffId(){
		var staffId = $("#staffId").val();
		
		location.href="${pageContext.request.contextPath}/StaffSalaryController/findByStaffId.action?staffId="+staffId;

	}
	
	function deleteById(staffSalaryId){
		if(confirm("是否确定删除")){
			location.href="${pageContext.request.contextPath}/StaffSalaryController/deleteById.action?staffSalaryId="+staffSalaryId;
		}
		
	}
	
	
</script>
</html>
