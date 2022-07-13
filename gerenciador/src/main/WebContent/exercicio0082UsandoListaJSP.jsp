<!-- esse arroba abaixo é uma declaração da PÁGINA JSP -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercicio 8.2 Mostrando os valores por JSP</title>
</head>
<body>
	<header>Empresas Cadastradas</header>
	<ul>
	<%	
		//No Eclipse, você pode remover a warning anotando a declaração da variável com: @SuppressWarnings("unchecked")
		//Essa warning acontece porque o compilador sempre garante que código que use generics não vai dar ClassCastException.
		//Mas como você está convertendo de um Object, que ele não tem como saber o que é, ele dá esse aviso dizendo
		//que ele não se garante.
		@SuppressWarnings("unchecked")
		List<Empresa> empresas = (List<Empresa>) request.getAttribute("empresas");
		for(Empresa empresa : empresas) {
	%>
		<li><%=empresa.getNome() %></li>
	<%
		}
	%>
	
	<%	//Esse código está muito ruim, pois é confuso e de difícil manutenção. Próximo exercício resolveremos isso. %>
	</ul>

</body>
</html>