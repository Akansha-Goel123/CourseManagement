package course.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import course.bean.AdminBean;
import course.bean.Register;
import course.bean.StudentLoginBean;
import course.bean.TeacherLoginBean;
import course.dao.DAO;
import course.dao.StudentLoginDao;
import course.dao.TeacherLoginDao;


public class TeacherLogin extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			int id=Integer.parseInt(request.getParameter("id"));
             String password=request.getParameter("password");
            if(id!=0  && password!="")
            {
            	TeacherLoginDao dao=new TeacherLoginDao();
        		TeacherLoginBean bean=dao.loginTeacher(id,password);
        		if(bean!=null)
        		{
        			HttpSession session=request.getSession();
        			session.setAttribute("id", id);
        			if(id==bean.getId() && password.equals(bean.getPassword()))
        			{
        				response.sendRedirect("instructor.jsp");
        			}
        			else
        			{
        				response.getWriter().println("id"+bean.getId()+" Password"+bean.getPassword());
        				//response.sendRedirect("studentLoginError.jsp");
        				RequestDispatcher req=request.getRequestDispatcher("teacherLoginError.jsp");
        				req.forward(request, response);
        			}
        			
        		}
        		else
        		{
        			response.sendRedirect("teacherLoginError.jsp");
        		}
        		
            }
            else
            {
            	response.sendRedirect("teacherLoginError.jsp");
            }
		}
		catch(Exception e)
		{
			response.sendRedirect("teacherLoginError.jsp");
		}
		
	}

}
