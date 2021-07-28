package course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import course.bean.UpdateInstructorBean;

public class UpdateInstructorDAO 
{
	public UpdateInstructorBean validateInstructors(int id, String password)
	{
		DAO dao=new DAO();
		UpdateInstructorBean bean=new UpdateInstructorBean();
	try
	{
		Connection connection=DAO.getConnection();
		PreparedStatement pstmt=connection.prepareStatement("select * from instructors where id=? AND password=?");
		pstmt.setInt(1, id);
		pstmt.setString(2, password);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next())
		{
			bean.setId(rs.getInt("id"));
			bean.setPassword(rs.getString("password"));
			
		}
		connection.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return bean;
	}
   public int updateInstructor(UpdateInstructorBean bean,int id)
   {
	   DAO dao=new DAO();
	   int result=0;
	   try
	   {
		   Connection connection=DAO.getConnection();
		   String sql="update instructors set email=?,phone=?,password=? where id=id";
		   PreparedStatement pstmt=connection.prepareStatement(sql);
		   pstmt.setString(1,bean.getEmail());
		   pstmt.setString(2, bean.getPhone());
		   pstmt.setString(3, bean.getPassword());
		   result=pstmt.executeUpdate();
		   connection.close();
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return result;
   }
}
