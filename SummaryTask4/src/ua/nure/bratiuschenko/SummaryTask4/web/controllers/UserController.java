package ua.nure.bratiuschenko.SummaryTask4.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.nure.bratiuschenko.SummaryTask4.dao.UserDAOImpl;
import ua.nure.bratiuschenko.SummaryTask4.domain.Doctor;
import ua.nure.bratiuschenko.SummaryTask4.domain.Patient;
import ua.nure.bratiuschenko.SummaryTask4.exception.DBException;
import ua.nure.bratiuschenko.SummaryTask4.utils.Connector;
import ua.nure.bratiuschenko.SummaryTask4.web.util.TableGenerator;



import org.apache.log4j.Logger;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/User")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger(UserController.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.getWriter()
				.print("<a href=/SummaryTask4/jsp/user/CheckUser.jsp>Look information about you</a>&nbsp;&nbsp;&nbsp;<br>");
		response.getWriter()
		.print("<br><a href=/SummaryTask4/jsp/user/FindDoctorById.jsp>Find doctor by id</a>&nbsp;&nbsp;&nbsp;<br>");
		response.getWriter()
				.print("<br><a href=http://www.aptekanizkihcen.ua>Buy medicines in our web store</a>&nbsp;&nbsp;&nbsp;</br><br>");
		response.getWriter().print(
				"<a href=index.jsp> Logout </a><br>");

		if (request.getParameter("Chsubmit") != null) {
			Integer id = Integer.valueOf(request.getParameter("ChId"));

			UserDAOImpl userDAO = new UserDAOImpl(Connector.getConnection());
			List<Patient> patients;
			try {
				patients = userDAO.findById(id);
				String patientsTable = TableGenerator
						.generatePatientsTable(patients);
				response.getWriter().print(patientsTable);
			} catch (DBException e) {
				LOG.error("can not find by id ", e);

			}
		
		}
		
if (request.getParameter("Inssubmit") != null) {
	
	Integer idD = Integer.valueOf(request.getParameter("InsId"));
	UserDAOImpl userDAO = new UserDAOImpl(Connector.getConnection());
	List<Doctor> doctors;
	try {
		doctors = userDAO.findDoctorById(idD);
		String doctorInfoTable = TableGenerator
				.generateDoctorsTable(doctors);
		response.getWriter().print(doctorInfoTable);
	} catch (DBException e) {
		LOG.error("can not generate doctor info table ", e);

	}
}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
