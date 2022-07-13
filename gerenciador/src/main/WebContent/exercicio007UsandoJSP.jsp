<%

	//Scriplet (pequeno script)
	String nomeEmpresa = (String) request.getAttribute("empresa");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercício 7 Usando JSP</title>
</head>
<body>

	<div>Empresa <%=nomeEmpresa %> cadastrada</div>

</body>
</html>