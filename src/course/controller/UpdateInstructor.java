package course.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import course.bean.UpdateInstructorBean;
import course.dao.UpdateInstructorDAO;

/**
 * Servlet implementation class UpdateInstructor
 */
public class UpdateInstructor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateInstructor() {
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
			String email=request.getParameter("email");
			String phone=request.getParameter("phone");
			String  password=request.getParameter("password");
			if(id!=0 && password!="")
			{
				UpdateInstructorDAO dao=new UpdateInstructorDAO();
				UpdateInstructorBean bean=dao.validateInstructors(id, password);
				if(id==bean.getId() && password.equals(bean.getPassword()))
				{
					UpdateInstructorBean bean1=new UpdateInstructorBean();
					UpdateInstructorDAO updateInstructorDAO=new UpdateInstructorDAO();
					
					bean1.setId(id);
					bean1.setEmail(email);
					bean1.setPassword(password);
					bean1.setPhone(phone);
					int res=updateInstructorDAO.updateInstructor(bean1,id);
					if(res>0)
					{
						PrintWriter pw=response.getWriter();
						pw.println("<html><body><h2>Record update successfull</h2></body></html>");
						RequestDispatcher req=request.getRequestDispatcher("updateInstructor.jsp");
						req.forward(request, response);
					}
					else
					{
						PrintWriter pw=response.getWriter();
						pw.println("<html><body><h2>!!OOPS Record not updated</h2></body></html>");
						RequestDispatcher req=request.getRequestDispatcher("updateInstructor.jsp");
						req.forward(request, response);
					}
				}
				else
				{
					PrintWriter pw=response.getWriter();
					pw.println("<html><body><h2>!!OOPS Record not updated</h2></body></html>");
					RequestDispatcher req=request.getRequestDispatcher("updateInstructor.jsp");
					req.forward(request, response);
				}
				
			}
			else
			{
				PrintWriter pw=response.getWriter();
				pw.println("<html><body><h2>!!OOPS Record not updated</h2></body></html>");
				RequestDispatcher req=request.getRequestDispatcher("updateInstructor.jsp");
				req.forward(request, response);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
