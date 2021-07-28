package course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import course.bean.AdminLoginBean;
import course.bean.StudentLoginBean;
import course.bean.TeacherLoginBean;

public class TeacherLoginDao
{
	public TeacherLoginBean loginTeacher(int id, String password)
	{
		DAO dao=new DAO();
		TeacherLoginBean bean=new TeacherLoginBean();
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
			bean.setUsername("username");
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
