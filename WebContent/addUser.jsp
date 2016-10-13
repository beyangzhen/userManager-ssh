<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<link rel="stylesheet" type="text/css" href="css/page.css">
<title>新增页面</title>
</head>
<body>
		<div id="container">
		    <div id="header">
		    	<jsp:include page="head.jsp"></jsp:include>
		    </div>
		    <div id="leftside">
		    	<jsp:include page="left.jsp"></jsp:include>
		    </div>
		    <div id="rightside">
		    	<s:form action="user/saveUser.action">
		    		<s:textfield name="userName" label="名字"></s:textfield><br/>
		    		<s:textfield name="age" label="年龄"></s:textfield><br/>
		    		<s:textfield name="no" label="学号"></s:textfield><br/>
		    		<s:textfield name="class_grade" label="班级"></s:textfield><br/>
		    		<s:submit></s:submit>
		    	</s:form>
		    </div>
		    <div id="footer">
		    	<jsp:include page="foot.jsp"></jsp:include>
		    </div>
		</div>
	</body>
</html>