package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getScoreServlet
 * @author - Carl Phillips
 * @description Gets the score from the form on the test page and sets the score as an attribute as initial score
 */
@WebServlet("/getScoreServlet")
public class getScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getScoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userScore = (String) request.getParameter("score");										//gets the score from the last page
		System.out.println(userScore);
		request.setAttribute("initialScore", userScore);												//sets the score from the test as initialScore
		getServletContext().getRequestDispatcher("/create-account.jsp").forward(request, response);		//sends the user to the create-account page 
		System.out.println("Got current score - forwarding to create-account.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
