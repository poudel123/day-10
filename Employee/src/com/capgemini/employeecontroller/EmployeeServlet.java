package com.capgemini.employeecontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.employee.employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<employee> emp= new ArrayList<>();

	private ServletContext context;


	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
		emp.add(new employee(111,"Priyanka",20000,"cloud"));
		emp.add(new employee(112,"Priya",25000,"SAP"));
		emp.add(new employee(113,"Poudel",20000,"java cloud"));
		emp.add(new employee(114,"Malyka",30000,"java"));
		emp.add(new employee(115,"sameera",25000,"cloud"));
		emp.add(new employee(116,"Pinky",29000,"cloud"));

	}
	public EmployeeServlet() {
		super();

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String id=request .getParameter("employeeNumber");
		for (employee employee : emp) {
			if(employee.getEmployeeNumber()==Long.parseLong(id))
			{
				out.println("<table style='border: 2px solid black' align='center'><tr><td>" + employee.getEmployeeNumber() + "<td>" + employee.getName()
				 + "<td>" + employee.getNameOfTheTdepartment() + "<td>" + employee.getSalary() + "</td></tr></table>");
			}
		}

	}

}
