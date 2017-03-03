package br.com.senac.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exemplo3Servlet
 */
@WebServlet("/Servlet4")
public class Exemplo04Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		
		if( nome.equals(""))
			nome = "Fantasminha Camarada";
		if( idade.equals(""))
			idade = "(não quis dizer a idade deve estar com vergonha.)";
		response.getWriter().println("Ok "+ nome +" sabemos que você tem "+ idade +" e  chamou o form com o  método GET ");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		
		if( nome.equals(""))
			nome = "Fantasminha Camarada";
		if( idade.equals(""))
			idade = "(não quis dizer a idade deve estar com vergonha.)";
		
		response.getWriter().println("Ok "+ nome +" sabemos que você tem "+ idade +" e  chamou o form com o  método POST ");
			
	}

}
