<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
		    	欢迎你
		    </div>
		    <div id="footer">
		    	<jsp:include page="foot.jsp"></jsp:include>
		    </div>
		</div>
	</body>
</html>