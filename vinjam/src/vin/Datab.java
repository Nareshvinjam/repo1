package vin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Datab {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loadded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","selenium123");
		Statement st=con.createStatement();
		ResultSet r=st.executeQuery("select *from seleniumuser");
		while(r.next()){
			String a=r.getString("Name");
			System.out.println("names is:"+a);
			String b=r.getString("Mail");
			System.out.println("Mails is:"+b);
		}
		
	}

}
