<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!public void jspInit() {

		ServletConfig sConfig = getServletConfig();
		String emailAddr = sConfig.getInitParameter("email");
		ServletContext ctx = getServletContext();
		ctx.setAttribute("email", emailAddr);
	}%>
<%= "Mail Attribute is: " + application.getAttribute("email") %>
<%
	
%>
</body>
</html>