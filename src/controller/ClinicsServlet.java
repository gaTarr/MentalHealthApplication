package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Craig Longnecker Servlet implementation class ClinicsServlet
 */
@WebServlet("/ClinicsServlet")
public class ClinicsServlet extends HttpServlet { // Class ClinicsServlet extends HttpServlet.
	private static final long serialVersionUID = 1L;

	/**
	 * Default Constructor
	 * 
	 * @see HttpServlet#HttpServlet()
	 */
	public ClinicsServlet() { // Default Constructor.
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // doGet method.
		ClinicsHelper dao = new ClinicsHelper();
		request.setAttribute("clinics", dao.showAllClinics());

		if (dao.showAllClinics().isEmpty()) { // Begin if statement.
			request.setAttribute("clinics", " ");
		} // Close if statement.
		getServletContext().getRequestDispatcher("/facilities_clinics.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // doPost method.
		doGet(request, response);
	}
} // Close class ClinicsServlet extends HttpServlet.
