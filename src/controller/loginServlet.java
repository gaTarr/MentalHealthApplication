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

		try {
			System.out.println(username);
			System.out.println(password);
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mentalhealth", "root", "root");
			Statement stmt = conn.createStatement(); 
			ResultSet rs = stmt.executeQuery("select username, password from users where username = '"+username+"' and password = '"+password+"'");
			
			if(rs.next()) {
				response.sendRedirect("results.jsp?name="+rs.getString("username"));
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
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
