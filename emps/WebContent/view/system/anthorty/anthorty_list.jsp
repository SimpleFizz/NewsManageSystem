<%@page import="com.guigu.pojo.AnthortyInfo"%>
<%@page import="java.util.List"%>
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
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/dtree.css">
<script src="${pageContext.request.contextPath }/js/dtree.js"></script>
</head>

<body onload="init();">
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li><a href="#">系统管理</a></li>
        <li>权限管理</li>
    </ul>
</div>
<div class="row">
	<div class="col-sm-2"  style=" padding-left:30px;">
	
	  <script type="text/javascript">
	  d = new dTree('d'); 
	   <%
	         Object  list =  request.getAttribute("abthortyList");
	        if(list != null){
	        	List<AnthortyInfo>  anthortyList = (List<AnthortyInfo>)list;
	        	if(anthortyList.size()> 0){
	        		for(AnthortyInfo anthorty : anthortyList){
	        			%>
	        			d.add(<%=anthorty.getAnthortyId()%>,<%=anthorty.getAnthortyPid()%>,'<%=anthorty.getAnthortyName()%>','${pageContext.request.contextPath}/AnthortyController/anthortyById.action?anthortyId=<%=anthorty.getAnthortyId()%>','<%=anthorty.getAnthortyDesc()%>','mainiframe');
	        			<%
	        		}
	        	}
	        }
	    
	    %>
	    document.write(d);
	  /*  
	  d = new dTree('d');
		d.add(0,-1,'根目录');
      d.add(1,0,'系统管理','','提示','');
		d.add(2,1,'员工管理','anthorty_show.html','提示','mainiframe');
		d.add(3,1,'角色管理','anthorty_add.html','提示','mainiframe');
		d.add(4,1,'角色变更','anthorty_add.html','提示','mainiframe');
		d.add(5,0,'招生管理','','提示','mainiframe');
		d.add(6,5,'学生线索','anthorty_add.html','提示','mainiframe');
		document.write(d); */
	  
	  </script>
	
    </div>
    <div class="col-sm-10">
    	<iframe id="mainframe" name="mainiframe"  style="width:100%; border:0px; " ></iframe>
        <script type="text/javascript">
            function init() {
            	var height = $(window).height()-50;
    		    $("#mainframe").attr("height",height+"px");
        	    $("#mainframe").attr("src","${pageContext.request.contextPath}/view/system/anthorty/anthorty_add.html");
			}
        </script>
        
    </div>

</div>


</body>

</html>
    