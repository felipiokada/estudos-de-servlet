<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/exercicio010CondicionaisJSTL" var="linkExercicio10"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercício 10</title>
</head>
<body>
	<p>Exercício 10</p>
	<form action="${ linkExercicio10 }" method="post">
		<p>Nome: <input type="text" name="nome"></p>
		<input type="submit">
	</form>
</body>
</html>