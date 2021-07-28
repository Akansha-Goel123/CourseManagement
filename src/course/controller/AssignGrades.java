package course.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import course.bean.AddGradesBean;
import course.dao.AddGradesDAO;
import course.dao.AssignGreadesDAO;

public class AssignGrades extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			String department=request.getParameter("department");
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			String subject=request.getParameter("subject");
			int grades=Integer.parseInt(request.getParameter("grades"));
			
			if(department!="" && id!=0 && name!="" && subject!="" && grades!=0)
			{
				AddGradesBean bean=new AddGradesBean();
				AssignGreadesDAO dao=new AssignGreadesDAO();
				bean.setDepartment(department);
				bean.setId(id);
				bean.setName(name);
				bean.setSubject(subject);
				bean.setGrades(grades);
				int result=dao.gradesStore(bean);
				if(result>0)
				{
					response.sendRedirect("instructor.jsp");
				}
				else
				{
					RequestDispatcher rdis=request.getRequestDispatcher("assignGrades.jsp");
					rdis.forward(request, response);
				}
			}
			else
			{
				RequestDispatcher rdis=request.getRequestDispatcher("assignGrades.jsp");
				rdis.forward(request, response);
			}
		}
		catch(Exception e)
		{
			RequestDispatcher rdis=request.getRequestDispatcher("assignGrades.jsp");
			rdis.forward(request, response);
		}
		
	}

}
