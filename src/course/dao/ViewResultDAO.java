package course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import course.bean.AddGradesBean;

public class ViewResultDAO 
{
  public AddGradesBean viewGrades(int id)
  {
	  AddGradesBean bean=new AddGradesBean();
	  try {
		  Connection connection=DAO.getConnection();
		  String sql="select * from result where id=id";
		  PreparedStatement pstmt=connection.prepareStatement(sql);
		  ResultSet set=pstmt.executeQuery();
		  while(set.next())
		  {
			  bean.setDepartment(set.getString("Department"));
			  bean.setGrades(set.getInt("grades"));
			  bean.setId(set.getInt("id"));
			  bean.setName(set.getString("name"));
			  bean.setSubject(set.getString("SubjectName"));
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
