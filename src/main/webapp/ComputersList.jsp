<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Computers</title>
</head>
<body>
	<form>
	<h1>Computers</h1>
	<table>
		<c:forEach items="${requestScope.allItems}" var="currentitem">
			<tr>
				<td><input type="radio" name="id" value="${currentitem.id}"></td>
				<td>${currentitem.manufacturer}</td>
				<td>${currentitem.type}</td>
				<td>${currentitem.os}</td>
			</tr>
			<h1>Computer Techs</h1>
			<c:forEach items="${currentitem.computerTechs}" var="computerTechs">
						<tr>
							<td><input type="radio" name="id" value="${currentitem.id}"></td>
							<td>${computerTechs.computerTechName}</td>
						</tr>
					</c:forEach>
		</c:forEach>
	</table>
	</form>
</body>
</html>