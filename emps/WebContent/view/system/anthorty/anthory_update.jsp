<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
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

<form action="${pageContext.request.contextPath}/AnthortyController/change.action" class="form-horizontal" method="post">

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-xs-5">
        	<div class="form-group">
            	<label class="col-xs-3 control-label">权限编号</label>
                <div class="col-xs-9">
                	<input type="text" name="anthortyId" value="${anthortyInfo.anthortyId }" class="form-control input-sm" placeholder="请输入权限编号"/>
                </div>
            </div>
        
        </div>
        <div class="col-xs-5">
            <div class="form-group">
            	<label class="col-xs-3 control-label">权限名称</label>
                <div class="col-xs-9">
                	<input type="text" name="anthortyName" value="${anthortyInfo.anthortyName }" class="form-control input-sm" placeholder="请输入权限名称"/>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
    	<div class="col-xs-5">
        	<div class="form-group">
            	<label class="col-xs-3 control-label">上级权限</label>
                <div class="col-xs-9">
                	<select class="form-control input-sm" name="anthortyPid">
                       <c:forEach items="${requestScope.anthortyInfoList }" var="anthorty">
                           <option value="${anthorty.anthortyId }"  ${anthorty.anthortyId==anthortyInfo.anthortyPid?"selected":"" }>${anthorty.anthortyName }</option>
                       </c:forEach>
                    </select>
                </div>
            </div>
        
        </div>
        <div class="col-xs-5">
            <div class="form-group">
            	<label class="col-xs-3 control-label">权限URL</label>
                <div class="col-xs-9">
                	<input type="text" name="anthortyUrl" value="${anthortyInfo.anthortyUrl }" class="form-control input-sm" placeholder="请输入权限URL"/>
                </div>
            </div>
        </div>
    </div>
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">备注信息</h5>
    	<div class="row">
    	<div class="col-xs-10">
        	<div class="form-group">
            	<label class="col-xs-3 control-label">备注</label>
                <div class="col-xs-9">
                	<textarea class="form-control" name="anthortyDesc">${anthortyInfo.anthortyDesc }</textarea>
                </div>
            </div>
        
        </div>

    </div>
 	<div class="row">
    	<div class="col-xs-3 col-xs-offset-3">
        	<input  type="submit" class="btn btn-success" value="保存权限信息"/>
        </div>
    </div>

</form>

</body>
</html>
    