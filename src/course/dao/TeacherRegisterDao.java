package course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import course.bean.TeacherRegisterBean;

public class TeacherRegisterDao
{
  public int registerTeacher(TeacherRegisterBean bean)
  {
	  DAO dao=new DAO();
	  int status=0;
	  try
	  {
		  	Connection connection=dao.getConnection();
		  	String sql="insert into instructors(name,username,email,password,department,address,phone) values(?,?,?,?,?,?,?)";
			 PreparedStatement pstmt=connection.prepareStatement(sql);
			 pstmt.setString(1,bean.getName());
			 pstmt.setString(2,bean.getUsername());
			 pstmt.setString(3,bean.getEmail());
			 pstmt.setString(4,bean.getPassword());
			 pstmt.setString(5,bean.getDepartment());
			 pstmt.setString(6,bean.getAddress());
			 pstmt.setString(7,bean.getPhone( ));
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
