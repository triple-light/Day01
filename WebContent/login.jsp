<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="Loginservlet" method="post">
	<!--  -->
	<lable>用户名：</lable>
	<input type="text" name="username" placeholder="请输入用户名" /><br/>
	<lable>密    码：</lable>
	<input type="password" name="pwd" placeholder="请输入密码" /><br/>
	<input type="submit" value="登录"/>
	<a href="Register.jsp">注册</a>
</form>
</body>
</html>