package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/exercicio008AdicionaNoBancoDeDadosJSP")
public class Exercicio008AdicionaNoBancoDeDadosJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		BancoDeDados bancoDeDados = new BancoDeDados();
		Empresa empresa = new Empresa();
		
		empresa.setNome(nome);
		bancoDeDados.adiciona(empresa);
		List<Empresa> listaEmpresas = bancoDeDados.getEmpresas();
		
		//chama o JSP
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/exercicio0082UsandoListaJSP.jsp");
		request.setAttribute("empresas", listaEmpresas);
		requestDispatcher.forward(request, response);
		
	}

}
