package course.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import course.bean.AdminBean;
import course.bean.Register;

public class DAO
{
	 static Connection connection=null;
	 public static Connection getConnection()
	 {  
	        Connection con=null;  
	        try
	        { 
	        	if(connection==null)
	        	{
	        		Class.forName(DatabaseConnection.Database_Driver);  
	        		con=DriverManager.getConnection(DatabaseConnection.URL,DatabaseConnection.USER,DatabaseConnection.PASS); 
	        	}
	        }
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        }  
	        return con;  
	    }  
		  
	 public int registerStudent(Register register)
	 {
		 int status=0;
		 try
		 {
			 Connection con=DAO.getConnection();
			 System.out.println("Create student connection"+con);
			 String sql="insert into student1(name,username,email,password,department,address,phone) values(?,?,?,?,?,?,?)";
			 PreparedStatement pstmt=con.prepareStatement(sql);
			 pstmt.setString(1, register.getName());
			 pstmt.setString(2,register.getUsername());
			 pstmt.setString(3,register.getEmail());
			 pstmt.setString(4,register.getPassword());
			 pstmt.setString(5,register.getDepartment());
			 pstmt.setString(6,register.getAddress());
			 pstmt.setString(7,register.getPhone( ));
			 status=pstmt.executeUpdate();
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 return status;
	 }
	 public int registerTeacher(Register register)
	 {
		 int status=0;
		 try
		 {
			 Connection con=DAO.getConnection();
			 System.out.println("Create teacher connection"+con);
			 String sql="insert into instructors(name,username,email,password,department,address,phone) values(?,?,?,?,?,?,?)";
			 PreparedStatement pstmt=con.prepareStatement(sql);
			 pstmt.setString(1, register.getName());
			 pstmt.setString(2,register.getUsername());
			 pstmt.setString(3,register.getEmail());
			 pstmt.setString(4,register.getPassword());
			 pstmt.setString(5,register.getDepartment());
			 pstmt.setString(6,register.getAddress());
			 pstmt.setString(7,register.getPhone( ));
			 status=pstmt.executeUpdate();
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 return status;
	 }
	 public Register loginStudent(int id , String username,String password)
	 {
		 Register register=new Register(); 
	        try{  
	            Connection con=DAO.getConnection(); 
	            System.out.println("Connection work"+con);
	           String sql="select * from student1 where id=? AND username=? AND password=?";
	            PreparedStatement ps=con.prepareStatement(sql);  
	            ps.setInt(1, id);
	            ps.setString(2,username);
	            ps.setString(3, password);
	            ResultSet resultSet=ps.executeQuery();
	            if(resultSet.next())
	            {
	            	register.setId(resultSet.getInt("id"));
	            	register.setName(resultSet.getString("name"));
	            	register.setEmail(resultSet.getString("email"));
	            	register.setPhone(resultSet.getString("phone"));
	            	register.setUsername(resultSet.getString("username"));
	            	register.setPassword(resultSet.getString("password"));
	            	register.setDepartment(resultSet.getString("department"));
	            	register.setActive(resultSet.getInt("active"));
	            	register.setAddress(resultSet.getString("address"));
	            	register.setStudentRegistrationDate(resultSet.getString("studentRegistrationDate"));
	            }
	            con.close();  
	        }
	        catch(Exception ex)
	        {
	        	ex.printStackTrace();
	        }  
	          
	        return register;  
		 
	 }
	 public AdminBean loginAdmin(String email,String password)
	 {
		 AdminBean register=new AdminBean(); 
	        try{  
	            Connection con=DAO.getConnection(); 
	            System.out.println("Connection work"+con);
	           String sql="select * from admin where email =? AND password=?";
	            PreparedStatement ps=con.prepareStatement(sql);  
	           
	            ps.setString(1,email);
	            ps.setString(2, password);
	            ResultSet resultSet=ps.executeQuery();
	            if(resultSet.next())
	            {
	            	register.setId(resultSet.getInt("id"));
	            	register.setName(resultSet.getString("name"));
	            	register.setEmail(resultSet.getString("email"));
	            	
	            	register.setUsername(resultSet.getString("username"));
	            	register.setPassword(resultSet.getString("password"));
	            }
	            con.close();  
	        }
	        catch(Exception ex)
	        {
	        	ex.printStackTrace();
	        }  
	          
	        return register;
	 }
	 public Register loginTeacher(String email, String password)
	 {
		 Register register=new Register(); 
	        try{  
	            Connection con=DAO.getConnection(); 
	            System.out.println("Connection work"+con);
	           String sql="select * from instructors where email=? AND password=?";
	            PreparedStatement ps=con.prepareStatement(sql);  
	            ps.setString(1, email);
	            ps.setString(2,password);
	           
	            ResultSet resultSet=ps.executeQuery();
	            if(resultSet.next())
	            {
	            	register.setId(resultSet.getInt("id"));
	            	register.setName(resultSet.getString("name"));
	            	register.setEmail(resultSet.getString("email"));
	            	register.setPhone(resultSet.getString("phone"));
	            	register.setUsername(resultSet.getString("username"));
	            	register.setPassword(resultSet.getString("password"));
	            	register.setDepartment(resultSet.getString("department"));
	            	register.setActive(resultSet.getInt("active"));
	            	register.setAddress(resultSet.getString("address"));
	            	register.setStudentRegistrationDate(resultSet.getString("studentRegistrationDate"));
	            }
	            con.close();  
	        }
	        catch(Exception ex)
	        {
	        	ex.printStackTrace();
	        }  
	          
	        return register;  
	 }
	/* public static List<Register> getAllStudent(){  
	        List<Register> list=new ArrayList<Register>();  
	          
	        try{  
	            Connection con=DAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from user905");  
	            ResultSet resultSet=ps.executeQuery();  
	            while(resultSet.next()){  
	                Register register=new Register();  
	                register.setId(resultSet.getInt("id"));
	            	register.setName(resultSet.getString("name"));
	            	register.setEmail(resultSet.getString("email"));
	            	register.setPhone(resultSet.getString("phone"));
	            	register.setUsername(resultSet.getString("username"));
	            	register.setPassword(resultSet.getString("password"));
	            	register.setDepartment(resultSet.getString("department"));
	            	register.setActive(resultSet.getInt("active"));
	            	register.setAddress(resultSet.getString("address"));
	            	register.setStudentRegistrationDate(resultSet.getString("studentRegistrationDate"));  
	                  
	                list.add(register);  
	            }  
	            con.close();  
	        }
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        }  
	          
	        return list;  
	    }  */
}


