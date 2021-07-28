package course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import course.bean.StudentRegisterBean;
import course.bean.TeacherRegisterBean;

public class StudentRegisterDao
{
	public int registerStudent(StudentRegisterBean bean)
	  {
		  DAO dao=new DAO();
		  int status=0;
		  try
		  {
			  	Connection connection=dao.getConnection();
			  	String sql="insert into student(name,email,phone,username,password,department,address) values(?,?,?,?,?,?,?)";
				 PreparedStatement pstmt=connection.prepareStatement(sql);
				 pstmt.setString(1,bean.getName());
				 pstmt.setString(2,bean.getEmail());
				 pstmt.setString(3,bean.getPhone( ));
				 pstmt.setString(4,bean.getUsername());
				 pstmt.setString(5,bean.getPassword());
				 pstmt.setString(6,bean.getDepartment());
				 pstmt.setString(7,bean.getAddress());
				
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
