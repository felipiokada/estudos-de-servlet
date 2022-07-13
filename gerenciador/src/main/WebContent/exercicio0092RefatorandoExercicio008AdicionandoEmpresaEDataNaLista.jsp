<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!-- Ele serve para diretórios -->
<c:url value="/exercicio0092Refatorando" var="linkParaExercicio0092Refatorando"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- MUDEI PARA JSP PORQUE EU QUERO USAR AS JSTL PARA NÃO MUDAR TODA HORA QUANDO O ACTION MUDA DE NOME "/gerenciador" -->
	<!-- Mudará de action="/gerenciador/exercicio0092Refatorando" PARA:
	               action="<c:url value="/exercicio0092Refatorando"/>"-->
	
	<header>Exercício 9.2: Refatorando exercício 8 usando JSTL (Java Standart Tag Library)</header>
	<form action="${ linkParaExercicio0092Refatorando }" method="post">
		<p>Nome: <input type="text" name="nome"></p>
		<p>Data: <input type="text" name="dataAbertura"></p>
		<input type="submit">
	</form>
</body>
</html>