package in.apcfss.controller;

import in.apcfss.dto.Employee;
import in.apcfss.service.CRUDOPerations;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewEmployees extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) 
	{
		PrintWriter out = null;
		res.setContentType("text/html");  
         
		List<Employee> employeesList = null;
		try
		{
			out=res.getWriter();  
	        out.println("<h1>Employees List</h1>"); 
			employeesList = CRUDOPerations.viewEmployee(req, res);
			out.print("<table border='1' width='100%'");  
	        out.print("<tr><th>Id</th><th>Name</th><th>qualification</th><th>gender</th><th>doj</th><th>Pancard</th><th>dob</th><th>salary</th><th>dayspresent</th>" +
	        		"<th>Edit</th><th>Delete</th><th>payslip</th></tr>");  
			for(Employee e:employeesList)
			{
				 out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getQualification()+"</td> " +
				 		"<td>"+e.getGender()+"</td><td>"+e.getDoj()+"</td><td>"+e.getPancard()+"</td><td>"+e.getDob()+"</td><td>"+e.getSalary()+"</td><td>"+e.getDayspresent()+"</td><td><a href='updateemp?id="+e.getId()+"'>edit</a></td>" +
				 				"<td><a href='deleteEmployee?id="+e.getId()+"'>delete</a></td><td><a href='employepayslip?id="+e.getId()+"'>payslip</a></td></tr>");  
			}
	       
	        out.print("</table>");  
	          
	        
		}
		catch(Exception e)
		{
			out.print("<h5>Problem in processing your request. Please try again.</h5>");  
			e.printStackTrace();
		}
		finally
		{
			out.close();
		}
	}

}
