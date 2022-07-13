package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exercicio0092Refatorando")
public class Exercicio0092Refatorando extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String data = request.getParameter("dataAbertura");
		Date dataAbertura = null;
		
		//tranformar string em Date
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		try {
			//Ele pode lançar um exception quando não tiver nada para parsear
			dataAbertura = dataFormatada.parse(data);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		//Vamos fazer um tratamento de dados na dataAbertura, porque como o request sempre devolve String, nós devemos
		//transformar data em Date. Abaixo a demonstração
		
		Empresa empresa = new Empresa();
		empresa.setNome(nome);
		empresa.setDataAbertura(dataAbertura);

		BancoDeDados bancoDeDados = new BancoDeDados();
		bancoDeDados.adiciona(empresa);
		
		//chamar o JSP
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("exercicio0092RefatorandoExercicio008UsandoJSTL.jsp");
		request.setAttribute("empresas", bancoDeDados.getEmpresas());
		requestDispatcher.forward(request, response);
		
	}

}
