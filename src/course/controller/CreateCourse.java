package course.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import course.bean.CourseBean;
import course.bean.TeacherRegisterBean;
import course.dao.CourseRegisterDAO;
import course.dao.TeacherRegisterDao;

/**
 * Servlet implementation class CreateCourse
 */
public class CreateCourse extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			String course=request.getParameter("course");
			String year=request.getParameter("year");
			String sub1=request.getParameter("sub1");
			String sub2=request.getParameter("sub2");
			String sub3=request.getParameter("sub3");
			String sub4=request.getParameter("sub4");
			String sub5=request.getParameter("sub5");
			if(course!="" && year!="" && sub1!="" && sub2!="" && sub3!="" && sub4!="" && sub5!="")
			{
				CourseBean register=new CourseBean();
				register.setCourse(course);
				register.setYear(year);
				register.setSubject1(sub1);
				register.setSubject2(sub2);
				register.setSubject3(sub3);
				register.setSubject4(sub4);
				register.setSubject5(sub5);
				CourseRegisterDAO dao=new CourseRegisterDAO();
				int res=dao.registerCourse(register);
				if(res>0)
				{
					response.getWriter().println("Register Success:");
					RequestDispatcher req=request.getRequestDispatcher("CreateCourse.java");
					req.forward(request, response);
				}
				else
				{
					response.getWriter().println("Login Error:");
					RequestDispatcher req=request.getRequestDispatcher("CreateCourse.java");
					req.forward(request, response);
				}
			}
			else
			{
			   response.sendRedirect("registerError.jsp");	
			}
		
	}
		catch(Exception e)
		{
			response.sendRedirect("registerError.jsp");
		}
	
		
	}

}
