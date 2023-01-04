//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.*;

import org.mindrot.jbcrypt.BCrypt;


public class SQL{
	String url = "jdbc:mysql://localhost:3306/pcrentaldb";
	String username = "root";
	String password = "T0oRd@t$Kr@Zy!";

	
	void createUser() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");   
			Connection con = DriverManager.getConnection(url,username,password);
	        System.out.println("Database connected!");
			try {
		        PreparedStatement pst = con.prepareStatement("INSERT INTO users"+"(user_id)"+" values(?)");
				
				pst.setString(1, admin.getUserName());
				
				pst.execute();
				
				pst.close();
				con.close();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
	}
	
	void deleteUser() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");      
			Connection con = DriverManager.getConnection(url,username,password);
	        try {
	        	PreparedStatement pst1 = con.prepareStatement("select * from users WHERE user_id='"+admin.getUserName()+"'");
				ResultSet rs = pst1.executeQuery();
				String userList = admin.getUserName(); // initialize variable so we can print the userList variable in if statement 
				// check the sqlQuery in DB
				// check if the user is in DB if its true it prints succesfully deleted then the next try catch will execute the deletion
				// if not print doesnt exist
				if(rs.next()) {
					userList = rs.getString("user_id");
					System.out.println("Username: "+userList+" Successfully deleted.");
				}else {
					System.err.println("Username: "+userList+" Doesn't exist");
				}
				try {
			        PreparedStatement pst = con.prepareStatement("DELETE FROM users WHERE user_id = ?");
						
					pst.setString(1, admin.getUserName());
					pst.executeUpdate();
					
					pst.close();
					con.close();
				}catch(SQLException e1) {
					e1.printStackTrace();
				}
				pst1.close();
	        }catch(SQLException e1) {
				e1.printStackTrace();
			}
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	
	void showAllUser() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			try {
				
				PreparedStatement st = con.prepareStatement("SELECT user_id FROM users");
				ResultSet rs = st.executeQuery();
				
				while(rs.next()) {
					String userList = rs.getString("user_id");
					System.out.println(userList);		
				}
				
				con.close();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	void showUser() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
				try {
				PreparedStatement st = con.prepareStatement("select * from users WHERE user_id='"+admin.getUserName()+"'");
				ResultSet rs = st.executeQuery();
				
				String userList = admin.getUserName(); // initialize variable so we can print the userList variable in else 
				// check the sqlQuery in DB
				// if sqlQuery true print exist, if not print doesnt exist
				if(rs.next()) {
					userList = rs.getString("user_id");
					System.out.println("Username: "+userList+" Exist");
				}else {
					System.err.println("Username: "+userList+" Doesn't exist");
				}
				
				con.close();
				}catch(SQLException e1){
					e1.printStackTrace();
				}
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	
	void insertPC() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			try {
				PreparedStatement pst = con.prepareStatement("INSERT INTO users"+"(user_rental)"+" values(?)");
				
				pst.setString(1, admin.getUserName());
				
				pst.execute();
				
				pst.close();
				con.close();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
			
			
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}
