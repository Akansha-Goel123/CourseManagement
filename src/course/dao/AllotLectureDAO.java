package course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import course.bean.AllotLectureBean;

public class AllotLectureDAO
{
   public int storeLecture(AllotLectureBean bean)
   {
	   int result=0;
	   try
	   {
		   Connection connection=DAO.getConnection();
		   String sql="insert into courseallotment1 values(?,?,?,?)";
		   PreparedStatement pstmt=connection.prepareStatement(sql);
		   pstmt.setString(1, bean.getDepartment());
		   pstmt.setString(2, bean.getYear());
		   pstmt.setString(3, bean.getFacultyName());
		   pstmt.setString(4, bean.getSubjectName());
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
