package Model;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.ArrayList;

import Utilities.*;

public class User {
	private String name,password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	JDBC_Connection connection = new JDBC_Connection();
	
	Connection cont =null;
	Statement stmt = null;
	PreparedStatement pstmt =null;
	ResultSet rs = null;

	public Boolean check() throws SQLException{
				int flag =0;
		String pass = null;
		cont = connection.connnect();
			
		String name = getName();
		pass = getPassword();
		
		stmt = cont.createStatement();
		rs = stmt.executeQuery("select * from login");
				
		while(rs.next()){
			System.out.println("1");
			String n1 = rs.getString(1).trim();
			String p1 = rs.getString(2).trim();
			if(name.equals(n1) && pass.equals(p1)){
				return true;
			}
		}
		return false;	
	}
	
}
