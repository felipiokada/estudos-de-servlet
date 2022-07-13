package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/exercicio005AdicionandoNaLista")
public class Exercicio005AdicionandoNaLista extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		Empresa empresa = new Empresa();
		String nome = request.getParameter("nome");
		empresa.setNome(nome);
		
		bancoDeDados.adiciona(empresa);
		
		PrintWriter saida = response.getWriter();
		saida.println("<html>");
		saida.println("<head>");
		saida.println("<title>Home teste com Tomcat</title>");
		saida.println("</head>");
		saida.println("<body>");
		saida.println("<p><strong>" + nome +" cadastrado com sucesso!</strong></p>");
		saida.println("</body>");
		saida.println("</html>");
		
	}

}
