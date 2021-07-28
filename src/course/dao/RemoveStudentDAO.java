package course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RemoveStudentDAO
{
   public int deleteStudent(int id)
   {
	   int result=0;
	   try
	   {
		   Connection connection=DAO.getConnection();
		   String sql="delete from student where id=?";
		   PreparedStatement pstmt=connection.prepareStatement(sql);
		   pstmt.setInt(1,id);
		   result=pstmt.executeUpdate();
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return result;
   }
}
