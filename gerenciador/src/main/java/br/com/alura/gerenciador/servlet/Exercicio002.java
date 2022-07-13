package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/exercicio002")
public class Exercicio002 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request.getParameter retorna STRING
		
		String nomeParametro = request.getParameter("nome");
		String pesoParametro = request.getParameter("peso");
		String localizacao = request.getParameter("localizacao");
		
		PrintWriter saida = response.getWriter();
		
		saida.println("<html>");
		saida.println("<head>");
		saida.println("<title>Home teste com Tomcat</title>");
		saida.println("</head>");
		saida.println("<body>");
		saida.println("<p><strong>Exercicio002 de Servlet. Testando parâmetros. </strong></p>");
		saida.println("<p>Meu nome é: "+ nomeParametro + "</p>");
		saida.println("<p>Tenho: " + pesoParametro +"kg </p>");
		saida.println("<p>Estado brasileiro: " + localizacao +" </p>");
		saida.println("</body>");
		saida.println("</html>");
		
		System.out.println("Servlet called");
		
	}

}
