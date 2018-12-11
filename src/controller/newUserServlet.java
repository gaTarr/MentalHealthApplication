package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginHelper;
import model.Score;
import model.User;
import utility.ServletUtils;

/**
 * Servlet implementation class newUserServlet
 */
@WebServlet("/newUserServlet")
public class newUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String un = request.getParameter("user");
		String pass = request.getParameter("pass");
		Integer score = Integer.parseInt(request.getParameter("score"));
		
		System.out.println("User and Pass:" + un + pass);
	
		User u = new User(un, pass);
		LoginHelper dao = new LoginHelper();
		dao.insertUser(u);
		
		System.out.println("newUserServlet>doPost'Before creation of Score'");
		User currentUser = dao.getUserByUsername(un); 	 //Retrieve user to create Score object
		Score s = new Score(score, currentUser.getId()); //Create score object
		dao.insertScore(s); 							 //Insert to database
		
		
		System.out.println("newUserServlet>doPost'After creation of Both'");
		
		ServletUtils.storeUser(request.getSession(), u);
		System.out.println(request.getSession());
		getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);
	}

}
