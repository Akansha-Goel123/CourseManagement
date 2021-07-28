package course.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import course.bean.AdminBean;
import course.bean.AdminLoginBean;
import course.dao.AdminLoginDao;
import course.dao.DAO;


public class AdminLogin extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String email=request.getParameter("email");
	    String password=request.getParameter("password");
		if(email!="" && password!="")
		{
			AdminLoginDao dao=new AdminLoginDao();
			//DAO dao=new DAO();
	        AdminLoginBean bean=dao.loginAdmin(email, password);
	        if(bean!=null)
	        {
	        	HttpSession session=request.getSession();
	        	session.setAttribute("email", bean.getEmail());
	        	session.setAttribute("name", bean.getName());
	        	if(email.equals(bean.getEmail()) && password.equals(bean.getPassword()))
	        	{
	        		response.sendRedirect("admin.jsp");
	        	}
	        	
	        	else
	        	{
	        		response.getWriter().append("Login Error");
	            	RequestDispatcher req=request.getRequestDispatcher("adminLoginError.jsp");
	            	req.forward(request, response);
	        	}
	        }
	        else
	        {
	        	response.sendRedirect("adminLoginError.jsp");
	        }
		}
		else
		{
			response.getWriter().println("Login Error");
			RequestDispatcher req=request.getRequestDispatcher("adminLoginError.jsp");
			req.forward(request, response);
		}
        
        
	}

	

}
