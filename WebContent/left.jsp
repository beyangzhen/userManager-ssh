<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<title>主页</title>
</head>
<body>
    <h3>菜单栏</h3>
   	<ul>
   		<li><a href="user/add">新增</a></li>
   		<li><a href="user/list">查询</a></li>
   		<!-- 
   		<li><a href="user/update">更新</a></li>
   		 -->
   	</ul>
</body>
</html>