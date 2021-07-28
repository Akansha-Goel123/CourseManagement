package course.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import course.bean.Register;
import course.bean.TeacherRegisterBean;
import course.dao.DAO;
import course.dao.TeacherRegisterDao;

/**
 * Servlet implementation class TeacherRegister
 */
public class TeacherRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
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
				TeacherRegisterBean register=new TeacherRegisterBean();
				register.setName(name);
				register.setEmail(email);
				register.setPhone(phone);
				register.setUsername(username);
				register.setAddress(address);
				register.setPassword(password);
				register.setDepartment(department);
				TeacherRegisterDao dao=new TeacherRegisterDao();
				int res=dao.registerTeacher(register);
				if(res>0)
				{
					response.sendRedirect("createteacher.jsp");
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
