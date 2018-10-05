package vin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Mysq {
	@Test
	
	public void nare() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","selenium123");
		Statement st=con.createStatement();
		ResultSet res=st.executeQuery("select *from seleniumuser");
		while(res.next()){
			String nam=res.getString("Name");
			System.out.println("tables name:"+nam);
			String m=res.getString("Mail");
			System.out.println("tables mail:"+m);
		}
	}
	

}
