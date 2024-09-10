<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Java Web Demo</title>
</head>
<body>
	<section>
<form action="/ltweb05/login" method="post" name="dang-ky">

Tên đăng nhập:<br/>

<input type="text" name="username" placeholder="Nhập tên đăng ký" /> <br />

Mật khẩu:<br/>

<input type="password" name="password" placeholder="Nhập mật khẩu" /> <br />

<input type="submit" name="login" value="Đăng nhập" />
<input type="submit" name="signup" value="Đăng ký"/>
</form>
</body>
</html>