package course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import course.bean.StudentUpdateBean;

public class StudentUpdateDAO
{
  public int updateStudent(StudentUpdateBean bean)
  {
	  int result=0;
	  try 
	  {
		  Connection connection=DAO.getConnection();
		  String sql="update student set phone=? AND password=? where id=id";
		  PreparedStatement pstmt=connection.prepareStatement(sql);
		  pstmt.setString(1,bean.getPhone());
		  pstmt.setString(2, bean.getPassword());
		  result=pstmt.executeUpdate();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return result;
  }
}
