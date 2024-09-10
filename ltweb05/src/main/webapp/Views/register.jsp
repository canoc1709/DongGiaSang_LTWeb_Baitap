<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/ltweb05/register" method="post" name="dang-ky">

Tên đăng nhập:<br/>
<input type="text" name="username" placeholder="Nhập tên đăng ký" /> <br />

Mật khẩu:<br/>
<input type="password" name="password" placeholder="Nhập mật khẩu" /> <br />

ID:<br/>
<input type="text"  name="id" placeholder="Nhập id" /> <br />

Email:<br/>
<input type="text"  name="email" placeholder="Nhập email" /> <br />

Username:<br/>
<input type="text"  name="username" placeholder="Nhập username" /> <br />

fullname:<br/>
<input type="text"  name="fullname" placeholder="Nhập fullname" /> <br />

phone:<br/>
<input type="text"  name="phone" placeholder="Nhập phone" /> <br />

phone:<br/>
<input type="text"  name="image" placeholder="Nhập image" /> <br />

roleid:<br/>
<input type="text"  name="roleid" placeholder="Nhập roleid" /> <br />

<input type="submit" name="submit" value="Đăng ký" />

</form>
</body>
</html>