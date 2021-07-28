package course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import course.bean.AdminBean;
import course.bean.AdminLoginBean;

public class AdminLoginDao 
{
  public AdminLoginBean loginAdmin(String email,String password)
  {
	  DAO dao=new DAO();
	  AdminLoginBean bean=new AdminLoginBean();
	  try
	  {
		  Connection connection=dao.getConnection();
		  PreparedStatement pstmt=connection.prepareStatement("select * from admin where email=? AND password=?");
		  pstmt.setString(1, email);
		  pstmt.setString(2, password);
		  ResultSet set=pstmt.executeQuery();
		  if(set.next())
		  {
			  bean.setEmail(set.getString("email"));
			  bean.setPassword(set.getString("password"));
			  bean.setName(set.getString("name"));
			  return bean;
		  }
		  else
		  {
			  return bean;
		  }
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return bean;
  }
}
