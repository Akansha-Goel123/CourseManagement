package course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import course.bean.FeedbackFormBean;

public class FeedbackFormDAO 
{
   public int storeFeedback(FeedbackFormBean bean)
   {
	   int result=0;
	   try
	   {
		   Connection connection=DAO.getConnection();
		   String sql="insert into feedbackform values(?,?,?)";
		   PreparedStatement pstmt=connection.prepareStatement(sql);
		   pstmt.setString(1, bean.getName());
		   pstmt.setString(2, bean.getPhone());
		   pstmt.setString(3, bean.getFeedback());
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
