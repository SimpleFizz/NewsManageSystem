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
        <li>添加薪水信息</li>
    </ul>
</div>

<form action="${pageContext.request.contextPath}/StaffSalaryController/update.action" method="post" class="form-horizontal">

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">编号</label>
                <div class="col-sm-9">
                	<input type="text" name="staffSalaryId"  value="${requestScope.staffSalary.staffSalaryId }" class="form-control input-sm" placeholder="请输入编号"  readonly="readonly"/>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">本月薪水</label>
                <div class="col-sm-9">
                	<input type="text" name="totalSalary"  value="${requestScope.staffSalary.totalSalary }" class="form-control input-sm" placeholder="请输入本月薪水"/>
                </div>
            </div>
        </div>

    </div>
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">扣除</label>
                <div class="col-sm-9">
               			<input type="text" value="${requestScope.staffSalary.deductSalary }" name="deductSalary" class="form-control input-sm" placeholder="请输入扣除金额"/>
                </div>
            </div>
        </div>
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">实际薪水</label>
                <div class="col-sm-9">
               		 <input type="text" value="${requestScope.staffSalary.realSalary }" name="realSalary"  class="form-control input-sm" placeholder="请输入实际薪水"/>
                </div>
            </div>
        
        </div>

    </div>
    

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">备注</h5>
    	<div class="row">
    	<div class="col-sm-10">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">备注</label>
                <div class="col-sm-9">
                	<textarea class="form-control" name="staffRemark" >${requestScope.staffSalary.staffRemark }</textarea>
                </div>
            </div>
        
        </div>

    </div>
 
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success" value="保存"/>

              <a class="btn btn-warning" href="classroominfo_list.html">返回上一级</a>
        </div>
    </div>
</form>

</body>
</html>
