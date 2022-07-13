package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/exercicio0091Refatorando")
public class Exercicio0091Refatorando extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Empresa empresa = new Empresa();
		empresa.setNome(request.getParameter("nome"));
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/exercicio0091RefatorandoExercicio007ComExpressionLanguage.jsp");
		request.setAttribute("empresa", empresa.getNome());
		requestDispatcher.forward(request, response);
		
	}

}
