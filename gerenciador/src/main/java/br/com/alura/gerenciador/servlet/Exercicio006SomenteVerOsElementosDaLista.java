package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exercicio006SomenteVerOsElementosDaLista")
public class Exercicio006SomenteVerOsElementosDaLista extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		List<Empresa> empresas = bancoDeDados.getEmpresas();
		
		PrintWriter saida = response.getWriter();
		saida.println("<html>");
		saida.println("<head>");
		saida.println("<title>Home teste com Tomcat</title>");
		saida.println("</head>");
		saida.println("<body>");
		saida.println("<ul>");
		
		for(Empresa empresa : empresas) {
			saida.println("<li>" + empresa.getNome() + "</li>");
		}
		
		saida.println("</ul>");
		saida.println("</body>");
		saida.println("</html>");
		System.out.println("Exercicio 6 chamado");
		
		//Nessa aula preparamos o modelo da nossa aplicação. O modelo ou domínio são as classes que representam
		//o mundo real, aquilo que o cliente ou usuário da aplicação define.

		//Para descobrir quais são as classes e funcionalidades do modelo o analista de requisitos
		//conversa com o cliente e documenta cada funcionalidade.

		//Nesse curso falaremos menos sobre o modelo e a camada de persistência como JDBC ou JPA.
		//Nós vamos focar nas Servlets, claro!
		
	}

}
