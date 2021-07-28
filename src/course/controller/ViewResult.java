package course.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import course.bean.AddGradesBean;
import course.dao.ViewResultDAO;


public class ViewResult extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			int id=Integer.parseInt(request.getParameter("id"));
			if(id!=0){
				ViewResultDAO dao=new ViewResultDAO();
				AddGradesBean bean=dao.viewGrades(id);
				if(bean!=null) {
					if(id==bean.getId()) {
						
					}
					else{
						
					}
				}
				else
				{
					
				}
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
