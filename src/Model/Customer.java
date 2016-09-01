package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Utilities.JDBC_Connection;

public class Customer {
	String cid;
	String name;
	String address;
	public Customer(String string, String string2, String string3) {
		this.cid = string;
		this.name = string2;
		this.address = string3;
		// TODO Auto-generated constructor stub
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Customer> csearch() throws SQLException{
		ArrayList<Customer> ar = new ArrayList<Customer>();
		JDBC_Connection connection = new JDBC_Connection();
		
		Connection cont =null;
		Statement stmt = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		String sql = "select * from customers";
		
		cont = connection.connnect();
		pstmt = cont.prepareStatement(sql);
		
		rs = pstmt.executeQuery();
		
		
		while(rs.next()){
			System.out.println(rs.getString(1));
			System.out.println(cid);
			if(rs.getString("cid").trim().equals(cid)){
				System.out.println("TRUE");
			}
			if(rs.getString(1).trim().equals(cid)){						
				System.out.println("timepass");
			Customer cus = new Customer(rs.getString(1),rs.getString(2),rs.getString(3));
			ar.add(cus);
			}
		}
		
		return ar;
	}
}
