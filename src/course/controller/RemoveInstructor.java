package course.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import course.dao.RemoveInstructorDAO;
import course.dao.RemoveStudentDAO;

/**
 * Servlet implementation class RemoveInstructor
 */
public class RemoveInstructor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveInstructor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
			int id=Integer.parseInt(request.getParameter("id"));
			if(id!=0)
			{
			   RemoveInstructorDAO dao=new RemoveInstructorDAO();
			   int res=dao.deleteInstructor(id);
			   if(res>0)
			   {
				   response.sendRedirect("admin.jsp");
			   }
			   else
			   {
				   response.sendRedirect("removeInstructor.jsp");
			   }
			}
			else
			   {
				   response.sendRedirect("removeInstructor.jsp");
			   }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
