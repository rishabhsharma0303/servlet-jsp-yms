<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="ob" class="com.demo.User">
		<jsp:setProperty property="*" name="ob" />
	</jsp:useBean>

	<jsp:getProperty property="name" name="ob" />
	<jsp:getProperty property="pass" name="ob" />
	<%-- <jsp:getProperty property="name" name="ob"/> --%>



	<%-- <%
	 if((request.getParameter("name").equals("raj")) &&(request.getParameter("pass").equals("java")))
	{
%>
	<jsp:forward page="home.jsp"/>
<%
}
	else
{
%>
	<%@include file="login.jsp"%>
<%

	}
%>
 --%>
</body>
</html>