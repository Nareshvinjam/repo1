package vin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class MyDb {
	
	@Test
	public void vinjam() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","selenium123");
		Statement r=con.createStatement();
		ResultSet s=r.executeQuery("select *from seleniumuser");
		while(s.next()){
			String a=s.getString("Name");
			System.out.println("names is:"+a);
			String b=s.getString("Mail");
			System.out.println("Mails is:"+b);
		}
		
	}

}

