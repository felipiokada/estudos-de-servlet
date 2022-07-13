<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercício 10 Condições com JSTL</title>
</head>
<body>
	<header>Java Standart TagLib: condicionais</header>
	<c:if test="${ not empty nomeEmpresa }">
		<p>Empresa ${ nomeEmpresa } cadastrada com sucesso</p>
	</c:if>
	<c:if test="${ empty nomeEmpresa }">
		<p>Nenhuma empresa cadastrada</p>
	</c:if>
</body>
</html>