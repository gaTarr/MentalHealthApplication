package controller;

import java.io.IOException;

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
		User thisUser = new User(username, password);
		LoginHelper dao = new LoginHelper();
		boolean result = dao.login(username, password);
		if(result = true) {
			RequestDispatcher rs = request.getRequestDispatcher("results");
			request.setAttribute("username", username);
			rs.forward(request, response);
			return;
		} else {
			System.out.println("Invalid Username or Password");
			RequestDispatcher rs = request.getRequestDispatcher("index");
			rs.include(request, response);
		}
		
		/**if(loginn == true) {
			ServletUtils.storeUser(request.getSession(), thisUser);
			System.out.println(request.getSession());
			getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);
		}**/
		
	}

}
