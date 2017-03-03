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
@WebServlet("/Servlet5")
public class Exemplo05Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		Integer num_1 = Integer.parseInt(num1);
		Integer num_2 = Integer.parseInt(num2);
		
		response.getWriter().println("A soma dos numeros "+ num1 +" + " + num2 +" é: "+ (num_1 + num_2));
			
	}

}
