package course.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import course.bean.StudentUpdateBean;
import course.dao.StudentUpdateDAO;

/**
 * Servlet implementation class UpdateStudent
 */
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudent() {
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
			String phone=request.getParameter("phone");
			String password=request.getParameter("password");
			if(id!=0 && password!="" && phone!="")
			{
				StudentUpdateBean bean=new StudentUpdateBean();
				StudentUpdateDAO dao=new StudentUpdateDAO();
				bean.setId(id);
				bean.setPassword(password);
				bean.setPhone(phone);
				int res=dao.updateStudent(bean);
				if(res>0)
				{
					response.sendRedirect("admin.jsp");
				}
				else
				{
					response.sendRedirect("updateStudent.jsp");
				}
			}
			else
			{
				response.sendRedirect("updateStudent.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
