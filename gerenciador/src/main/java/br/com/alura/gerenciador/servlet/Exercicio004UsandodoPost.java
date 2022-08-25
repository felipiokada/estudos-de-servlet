package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/exercicio004UsandodoPost")
public class Exercicio004UsandodoPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//o método service ele realiza operacoes tanto GET quanto POST. Se deseja
	//efetuar somente um ou outro, deve usar doGet ou doPost
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomePost = request.getParameter("nome");
		String alturaPost = request.getParameter("altura");

		BigDecimal alturaMultiplicada = new BigDecimal(alturaPost).multiply(new BigDecimal("1.1")).setScale(2, RoundingMode.HALF_UP);
		
		PrintWriter saida = response.getWriter();
		saida.println("<html>");
		saida.println("<head>");
		saida.println("<title>Home teste com Tomcat</title>");
		saida.println("</head>");
		saida.println("<body>");
		saida.println("<p><strong>Exercicio004 de Servlet. Testando parâmetros. </strong></p>");
		saida.println("<p>Meu nome é: "+ nomePost + "</p>");
		saida.println("<p>Tenho: " + alturaPost +" metros </p>");
		saida.println("<p>Sua altura multiplicado por 1.1 = " + alturaMultiplicada +" metros</p>");
		saida.println("</body>");
		saida.println("</html>");
		
		System.out.println("Exericio004 chamado");
	}
	
	//para averiguar que o método GET não funciona, tente colocar os parâmetros na URL
	//localhost:8080/gerenciador/exercicio004UsandodoPost?nome=felipi&altura=4003
	//dará erro 405: method not allowed

}
