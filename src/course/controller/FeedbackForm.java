package course.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import course.bean.FeedbackFormBean;
import course.dao.FeedbackFormDAO;


public class FeedbackForm extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			String name=request.getParameter("name");
			String phone=request.getParameter("phone");
			String feedback=request.getParameter("feedback");
	   
			if(name!="" && phone!="" && feedback!="")
			{
				FeedbackFormBean bean=new FeedbackFormBean();
				FeedbackFormDAO dao=new FeedbackFormDAO();
				bean.setName(name);
				bean.setPhone(phone);
				bean.setFeedback(feedback);
				int result=dao.storeFeedback(bean);
				if(result>0)
				{
					RequestDispatcher req=request.getRequestDispatcher("home.jsp");
					req.forward(request, response);
				}
				else
				{
					RequestDispatcher req=request.getRequestDispatcher("homeLoginError.jsp");
					req.forward(request, response);
				}
			}
			else
			{
				RequestDispatcher req=request.getRequestDispatcher("homeLoginError.jsp");
				req.forward(request, response);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	   
	}

}
