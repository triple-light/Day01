<%@page import="com.AC.Data.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<% User user1=(User)request.getAttribute("user"); %>
<%
if(user1.getIssuccess()){
%>
	<h1><%=user1.getResult() %></h1>
	<lable>用户名： <%=user1.getUsername() %></lable><br/>
	<lable>密码： <%=user1.getPwd() %></lable><br/>
	<a href="login.jsp"><button>前往登录</button></a>
<% }else{%>
	<h1><%=user1.getResult() %></h1><br/>
	<a href="Register.jsp"><button>重新注册</button></a>
<%} %>

</body>
</html>