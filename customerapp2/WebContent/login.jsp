<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page</title>
</head>
<body>
${param.error}<br/>
${param.message }<br/>

<form action="login" method="post">
	Enter name :<input type="text" name="username"><br/>
	Enter paswrod :<input type="password" name="password"><br/>
	<input type="submit"/>
</form>
</body>
</html>