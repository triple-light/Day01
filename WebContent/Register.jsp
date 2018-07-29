<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="Registerservlet" method="post">
<lable>
用 &nbsp;户 &nbsp;名：<input type="text" name="username" placeholder="请输入用户名" />
</lable>
<br/>
<lable>
密 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="pwd" placeholder="请输入密码" />
</lable>
<br/>
<lable>
确认密码：<input type="password" name="cpwd" placeholder="请再次输入密码" />
</lable>
<br/>
<input type="submit" value="确认提交"/>
</form>
</body>
</html>