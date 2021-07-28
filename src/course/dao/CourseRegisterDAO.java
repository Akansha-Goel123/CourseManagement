package course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import course.bean.CourseBean;
import course.bean.StudentLoginBean;
import course.bean.TeacherRegisterBean;

public class CourseRegisterDAO
{
	public int registerCourse(CourseBean bean)
	  {
		  DAO dao=new DAO();
		  int status=0;
		  try
		  {
			  	Connection connection=dao.getConnection();
			  	String sql="insert into course values(?,?,?,?,?,?,?)";
				 PreparedStatement pstmt=connection.prepareStatement(sql);
				 pstmt.setString(1,bean.getCourse());
				 pstmt.setString(2,bean.getYear());
				 pstmt.setString(3,bean.getSubject1());
				 pstmt.setString(4,bean.getSubject2());
				 pstmt.setString(5,bean.getSubject3());
				 pstmt.setString(6,bean.getSubject4());
				 pstmt.setString(7,bean.getSubject5());
				 status=pstmt.executeUpdate();
				 if(status>0)
				 {
					 return 1;
				 }
				 else
				 {
					 return 0;
				 }
			  
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		  return 0;
	  }

	
	
}
