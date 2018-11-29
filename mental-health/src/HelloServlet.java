package edu.dmacc.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String yourName = request.getParameter("yourName");
		String yourLastName = request.getParameter("yourLastName");
		String capitalizedName = yourName.substring(0,1).toUpperCase() + yourName.substring(1).toLowerCase() + " " + yourLastName.substring(0,1).toUpperCase() + yourLastName.substring(1).toLowerCase();
		
		PrintWriter writer = response.getWriter();
		writer.print("Hello " + capitalizedName);
		writer.close();
	}

}
