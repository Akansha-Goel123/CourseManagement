package course.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AdminLogout extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		 	HttpSession session=request.getSession();
	        session.invalidate();
	        int res=1;
	        if(res>0)
	        {
	        	response.sendRedirect("home.jsp");
	        }	
	}

}
