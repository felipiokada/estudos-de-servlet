<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercicio 9.2 Refatorando Exercicio 8</title>
</head>
<body>
<header>Exercício 9.2 Refatorando exercício 8</header>
	<p>Empresas cadastradas</p>
	<ul>
		<c:forEach items="${ empresas }" var="empresa">
			<li>Nome: ${ empresa.nome } - Data de Abertura: <fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/></li>
		</c:forEach>
	</ul>

</body>
</html>