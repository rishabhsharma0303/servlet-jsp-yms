<%@page import="com.customerapp.dao.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
success, record is saved....
<a href="logout.do">logout</a> <br/>
<%
	Customer customer=(Customer)session.getAttribute("customer");
	out.println(customer.getName()+"<br/>");
	out.println(customer.getEmail()+"<br/>");
	out.println(customer.getMobile()+"<br/>");
%>
</body>
</html>