import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.mindrot.jbcrypt.BCrypt;

public class admin {
//	String url = "jdbc:mysql://localhost:3306/pcrentaldb";
//	String username = "root";
//	String password = "T0oRd@t$Kr@Zy!";
	
	static String userName;
	static String admin;
	static String adminPWD;
	private static String userPWD;
	int rentHr;
	int rentPrice = 25;
	
	// constructor arguments
	admin(){
		admin=null;
		adminPWD=null;
		userName=null;
		rentHr=0;
	}
	
	// constructor overloading
	admin(String userName, String admin, String adminPWD, int rentHr){
		this.userName = userName;
		this.admin = admin;
		this.adminPWD = adminPWD;
		this.rentHr = rentHr;
	}
	
	static String getAdminName() {
		return admin;
	}
	
	public void setAdminName(String admin) {
		this.admin = admin;
	}
	
	static String getAdminPWD() {
		return admin;
	}
	
	public void setAdminPWD(String adminPWD) {
		this.adminPWD = adminPWD;
	}

	// getter userName
	public static String getUserName() {
		return userName;
	}
	
	// setter userName
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	// getter rentHr
	public int getRentHr() {
		return rentHr;
	}
	
	// setter rentHr
	public void setRentHr(int rentHr) {
		this.rentHr = rentHr;
	}

	// computing the rent amount method
	public void rentAmount(int rentPrice, int rentHr) {
		rentPrice = rentPrice * rentHr;
		System.out.println(rentPrice);
	}
	
}
	

