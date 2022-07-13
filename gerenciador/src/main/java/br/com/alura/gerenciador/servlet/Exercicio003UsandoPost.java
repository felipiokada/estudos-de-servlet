package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/exercicio003UsandoPost")
public class Exercicio003UsandoPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//quando usamos o get, perceba que os parâmetros são mostrados na URL
		//para caso de senha, isso significa que ela seria mostrada na URL. Porque o GET
		//serve para retornar um valor como uma pesquisa, um dado no banco de dados e etc
		
		//O POST serve para adicionar ou alterar um valor e ele não mostra as informações na URL
		
		String nomePost = req.getParameter("nome");
		String pesoPost = req.getParameter("peso");

		PrintWriter saida = resp.getWriter();
		saida.println("<html>");
		saida.println("<head>");
		saida.println("<title>Home teste com Tomcat</title>");
		saida.println("</head>");
		saida.println("<body>");
		saida.println("<p><strong>Exercicio003 de Servlet. Testando parâmetros. </strong></p>");
		saida.println("<p>Meu nome é: "+ nomePost + "</p>");
		saida.println("<p>Tenho: " + pesoPost +"kg </p>");
		saida.println("</body>");
		saida.println("</html>");
		
		
	}

}
