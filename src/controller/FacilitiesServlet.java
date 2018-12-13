package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Craig Longnecker Servlet implementation class FacilitiesServlet
 */
@WebServlet("/FacilitiesServlet")
public class FacilitiesServlet extends HttpServlet { // Class FacilitiesServlet extends HttpServlet.
	private static final long serialVersionUID = 1L;

	/**
	 * Default Constructor
	 * 
	 * @see HttpServlet#HttpServlet()
	 */
	public FacilitiesServlet() { // Default Constructor.
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // doGet method.
		FacilitiesHelper dao = new FacilitiesHelper();
		ClinicsHelper dao2 = new ClinicsHelper();
		request.setAttribute("facilities", dao.showAllFacilities());
		request.setAttribute("clinics", dao2.showAllClinics());

		if (dao.showAllFacilities().isEmpty()) { // Begin if statement.
			request.setAttribute("facilities", "There are currently no facilities available.");
		} // Close if statement.
		if (dao2.showAllClinics().isEmpty()) { // Begin if statement.
			request.setAttribute("facilities", "There are currently no clinics available.");
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
} // Close class FacilitiesServlet extends HttpServlet.
