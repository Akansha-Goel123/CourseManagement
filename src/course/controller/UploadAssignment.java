package course.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class UploadAssignment
 */
public class UploadAssignment extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String file="E:\\MyJava\\JavaEEFolder\\CourseManagement\\WebContent\\UploadAssignment";
		//String file=this.getServletConfig().getServletContext().getRealPath("dataupload");
		MultipartRequest mpreq=new MultipartRequest(request, file,1024*1024*20);
		String data= mpreq.getOriginalFileName("file");
		pw.println(data);
		String name=mpreq.getParameter("sub-name");
		pw.println("UserName"+name);
		pw.println(data+"fileupload...");
		pw.close();
	}

}
