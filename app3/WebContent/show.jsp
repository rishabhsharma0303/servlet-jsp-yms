<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All books informations</title>
</head>
<body>
<table border="2">
	<thead>
	<tr>
		<th>id</th>
		<th>title</th>
		<th>price</th>
		<th>date</th>
	</tr>
	</thead>
	<tbody>
		<c:forEach items="${books}" var="book">
			<tr>
				<td>${book.id }</td>
				<td>${book.title }</td>
				<td>${book.price }</td>
				<td><fmt:formatDate pattern="dd/MM/yyyyy"  value="${book.date }"/></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>