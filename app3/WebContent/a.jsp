<%@page import="com.demo.Dog"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="false" errorPage="b.jsp" %>
<%@ include file="demo.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Dog d=new Dog();
		d.setDogName("foo");
		out.print(d.getDogName());
	%>
</body>
</html>