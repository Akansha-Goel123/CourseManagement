package course.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import course.bean.AllotLectureBean;
import course.dao.AllotLectureDAO;

/**
 * Servlet implementation class AllotLecture
 */
public class AllotLecture extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllotLecture() {
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
		  String department=request.getParameter("department");
		  String year=request.getParameter("year");
		  String faculty=request.getParameter("tchname");
		  String subject=request.getParameter("subject");
		  if(department!="" && faculty!="" && subject!="")
		  {
			  AllotLectureBean bean=new AllotLectureBean();
			  AllotLectureDAO dao=new AllotLectureDAO();
			  bean.setDepartment(department);
			  bean.setYear(year);
			  bean.setFacultyName(faculty);
			  bean.setSubjectName(subject);
			  int res=dao.storeLecture(bean);
			  if(res>0)
			  {
				  response.sendRedirect("admin.jsp");
			  }
			  else
			  {
				  response.sendRedirect("allotLecture.jsp");
			  }
		  }
		  else
		  {
			  response.sendRedirect("allotLecture.jsp");
		  }
	  }	
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	}

}
