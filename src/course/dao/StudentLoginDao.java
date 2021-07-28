package course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import course.bean.StudentLoginBean;

public class StudentLoginDao 
{
  public StudentLoginBean loginStudent(int id,String password)
  {
	
	StudentLoginBean bean=new StudentLoginBean();
	try
	{
		Connection connection=DAO.getConnection();
		PreparedStatement pstmt=connection.prepareStatement("select * from student where id=? AND password=?");
		pstmt.setInt(1, id);
		pstmt.setString(2, password);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next())
		{
			bean.setId(rs.getInt("id"));
			bean.setPassword(rs.getString("password"));
			bean.setUsername(rs.getString("username"));
			bean.setName(rs.getString("name"));
		}
		connection.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return bean;
  }
}
