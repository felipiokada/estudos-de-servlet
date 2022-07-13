package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet: 
// É mapeado para uma URL
// É um objeto
// Pode ser chamado por meio do protocolo HTTP

@WebServlet(urlPatterns = "/testando")
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter servico = resp.getWriter();
		servico.println("<html>");
		servico.println("<head>");
		servico.println("<title>Home teste com Tomcat</title>");
		servico.println("</head>");
		servico.println("<body>");
		servico.println("<p><strong>Testando página HTML usando Servlets Tomcat no Java EE!!!</strong></p>");
		servico.println("</body>");
		servico.println("</html>");
		
		System.out.println("Servlet called");
		
	}
	
}
