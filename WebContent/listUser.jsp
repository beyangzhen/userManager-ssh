<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>
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
<title>查询页面</title>
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
		    	<!-- userList -->
		    	
		    	<table border="1" width="100%">
		    		<thead>
		    			<tr><th>序号</th><th>名字</th><th>年龄</th><th>学号</th><th>班级</th><th>操作</th></tr>
		    		</thead>
		    		<tbody>
		    			<c:forEach items="${userList}" var="user" varStatus="index_">
		    				<tr>
		    					<td>${index_.index+1}</td>
		    					<td>${user.userName }</td>
		    					<td>${user.age }</td>
		    					<td>${user.no }</td>
		    					<td>${user.class_grade }</td>
		    					<td>
		    						<a href="user/update.action?userId=${user.userId}" title="${user.userId}">更新</a> &nbsp;&nbsp;
		    						<a href="user/delete.action?userId=${user.userId}" title="${user.userId}">删除</a> 
		    					</td>
		    				</tr>
		    			</c:forEach>
                     
		    		</tbody>
		    	</table>
		    	
		    </div>
		    <div id="footer">
		    	<jsp:include page="foot.jsp"></jsp:include>
		    </div>
		</div>
	</body>
</html>