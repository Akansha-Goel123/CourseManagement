package course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import course.bean.AddGradesBean;

public class AssignGreadesDAO
{
	public int gradesStore(AddGradesBean bean)
	{
		int result=0;
		try
		{
			Connection connection=DAO.getConnection();
			String sql="insert into result values(?,?,?,?,?)";
			PreparedStatement pstmt=connection.prepareStatement(sql);
			pstmt.setString(1, bean.getDepartment());
			pstmt.setInt(2, bean.getId());
			pstmt.setString(3, bean.getName());
			pstmt.setString(4, bean.getSubject());
			pstmt.setInt(5, bean.getGrades());
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
