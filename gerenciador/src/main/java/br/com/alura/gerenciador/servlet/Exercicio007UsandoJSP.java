package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exercicio007UsandoJSP")
public class Exercicio007UsandoJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(nome);
		
		//chama o JSP
		RequestDispatcher rd = request.getRequestDispatcher("/exercicio007UsandoJSP.jsp");	//invoca o JSP
		request.setAttribute("empresa", empresa.getNome());		//esse método acopla um documento ao request que será enviado ao JSP
		rd.forward(request, response);							//envia (vai filhão)
		
	}

}
