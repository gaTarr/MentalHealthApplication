package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Craig Longnecker Servlet implementation class MedicationsServlet
 */
@WebServlet("/MedicationsServlet")
public class MedicationsServlet extends HttpServlet { // Class MedicationsServlet extends HttpServlet.
	private static final long serialVersionUID = 1L;

	/**
	 * Default Constructor
	 * 
	 * @see HttpServlet#HttpServlet()
	 */
	public MedicationsServlet() { // Default Constructor.
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // doGet method.
		MedicationsHelper dao = new MedicationsHelper();
		request.setAttribute("medications", dao.showAllMedications());

		if (dao.showAllMedications().isEmpty()) { // Begin if statement.
			request.setAttribute("medications", " ");
		} // Close if statement.
		getServletContext().getRequestDispatcher("/medications.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // doPost method.
		doGet(request, response);
	}
} // Close class MedicationsServlet extends HttpServlet.
