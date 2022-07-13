package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exercicio010CondicionaisJSTL")
public class Exercicio010CondicionaisJSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String nome = request.getParameter("nome");
		 
		 RequestDispatcher requestDispatcher =  request.getRequestDispatcher("exercicio010CondicoesComJSTL.jsp");
		 request.setAttribute("nomeEmpresa", nome);
		 requestDispatcher.forward(request, response);
	}

}
