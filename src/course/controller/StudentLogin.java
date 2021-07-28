package course.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import course.bean.Register;
import course.bean.StudentLoginBean;
import course.dao.DAO;
import course.dao.StudentLoginDao;


public class StudentLogin extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{ 
		try
		{
			int id=Integer.parseInt(request.getParameter("id"));
            String password=request.getParameter("password");
            if(id!=0  && password!="")
            {
            	StudentLoginDao dao=new StudentLoginDao();
        		StudentLoginBean bean=dao.loginStudent(id,password);
        		if(bean!=null)
        		{
        			HttpSession session=request.getSession();
    				session.setAttribute("id",id);
    				session.setAttribute("name", bean.getName());
        			if(id==bean.getId() && password.equals(bean.getPassword()))
        			{
        				RequestDispatcher req=request.getRequestDispatcher("student.jsp");
        				req.include(request, response);
        			}
        			else
        			{
        				response.sendRedirect("studentLoginError.jsp");
        			}
        			
        		}
        		else
        		{
        			response.sendRedirect("studentLoginError.jsp");
        		}
        		
            }
            else
            {
            	response.sendRedirect("studentLoginError.jsp");
            }
		}
		catch(Exception e)
		{
			response.sendRedirect("studentLoginError.jsp");
		}
	}

}
