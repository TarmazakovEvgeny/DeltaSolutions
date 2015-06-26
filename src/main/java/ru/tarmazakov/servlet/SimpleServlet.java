package ru.tarmazakov.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ru.tarmazakov.dao.EmployeeDAO;
import ru.tarmazakov.dao.EmployeeDAOLocal;

@WebServlet(name = "Servlet", urlPatterns = { "protected/Servlet" })
public class SimpleServlet extends HttpServlet {

	/**
	 * 
	 */
	@EJB
	private EmployeeDAOLocal employeeDao;

	private static final long serialVersionUID = 1L;
	private String responseTemplate = "<html>\n" + "<body>\n"
			+ "<h2>Hello from Simple Servlet</h2>\n" + "</body>\n" + "</html>";

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		try {
			this.process(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		try {
			this.process(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void process(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ClassNotFoundException {
		response.setStatus(200);
		String action = request.getParameter("action");

		
	

		// Employee employee = new Employee(studentId, firstname, lastname,
		// position);

		response.getWriter().write(action);
		response.getWriter().write(responseTemplate);
	}
}
