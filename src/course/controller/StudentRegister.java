package course.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import course.bean.StudentRegisterBean;
import course.bean.TeacherRegisterBean;
import course.dao.StudentRegisterDao;
import course.dao.TeacherRegisterDao;

/**
 * Servlet implementation class StudentRegister
 */
public class StudentRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegister() {
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
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String phone=request.getParameter("phone");
			String username=request.getParameter("username");
			String address=request.getParameter("address");
			String password=request.getParameter("password");
			String department=request.getParameter("department");
			if(name!="" && email!="" && phone!="" && username!="" && address!="" && password!=""
					&& department!="")
			{
				StudentRegisterBean register=new StudentRegisterBean();
				register.setName(name);
				register.setEmail(email);
				register.setPhone(phone);
				register.setUsername(username);
				register.setAddress(address);
				register.setPassword(password);
				register.setDepartment(department);
				StudentRegisterDao dao=new StudentRegisterDao();
				int res=dao.registerStudent(register);
				if(res>0)
				{
					response.sendRedirect("createStudent.jsp");
				}
				else
				{
					response.sendRedirect("registerError.jsp");
				}
			}
			else
			{
			   response.sendRedirect("registerError.jsp");	
			}
		
	}
		catch(Exception e)
		{
			response.sendRedirect("registerError.jsp");
		}
	}

}
