package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utility.ServletUtils;
import model.User;
import model.LoginHelper;
import model.Score;

/**
 * Servlet implementation class loginServlet
 * @author - Carl Phillips
 * @description - logs the user in, and gets their scores from the database so their information can be displayed in the bar graph
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("userName");
		String password = request.getParameter("userPassword");
		String userScore = (String) request.getParameter("loginScore");
		String scores;
		Integer score = Integer.parseInt(userScore);
		
		LoginHelper dao = new LoginHelper();

		try {											//makes the connection with the database
			Class.forName("com.mysql.jdbc.Driver"); 	
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mentalhealth", "root", "root");
			Statement stmt = conn.createStatement(); 
														//gets the user from the server if the username and password match
			ResultSet rs = stmt.executeQuery("select username, password from users where username = '"+username+"' and password = '"+password+"'");
			
			if(rs.next()) {
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				
				System.out.println("loginServlet>doPost'Before creation of Score'");
				User currentUser = dao.getUserByUsername(username); 	 //Retrieve user to create Score object
				Score s = new Score(score, currentUser.getId()); 		//Create score object
				dao.insertScore(s); 							 		//Inserts the score to the database
				scores = dao.getScores(username);						//gets the scores from the database that corresponds with the username
				request.setAttribute("allScores", scores);				//sets the scores as an attribute to be used later
				getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);
				System.out.println("Success!");
			} else {
				System.out.println("Incorrect");
			}
		} catch (Exception e) {
			System.out.println("failed");
			response.sendRedirect("index.jsp");
			e.printStackTrace();
		} finally {
			System.out.println("Finally");
		}
		
	}

}
