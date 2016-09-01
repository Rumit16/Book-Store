package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Utilities.JDBC_Connection;

public class Order {
	private String isbn;
	private String cid;
	private int orderq;
	private String orderd;
	private String card;
	private String ship;
	public Order(String string, String string2, int int1, String string3, String int2,
			String string4) {
		this.isbn = string;
		this.cid = string;
		this.orderq = int1;
		this.orderd = string3;
		this.card = int2;
		this.ship = string4;
		// TODO Auto-generated constructor stub
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public int getOrderq() {
		return orderq;
	}
	public void setOrderq(int orderq) {
		this.orderq = orderq;
	}
	public String getOrderd() {
		return orderd;
	}
	public void setOrderd(String orderd) {
		this.orderd = orderd;
	}
	public String getShip() {
		return ship;
	}
	public void setShip(String ship) {
		this.ship = ship;
	}
	
JDBC_Connection connection = new JDBC_Connection();
	
	Connection cont =null;
	Statement stmt = null;
	PreparedStatement pstmt =null;
	ResultSet rs = null;
	String i;
	
public ArrayList<Order> bsearch() throws SQLException{	
		
		String sql = "select * from orders";
		ArrayList<Order> ar = new ArrayList<Order>(); 
		cont = connection.connnect();
		pstmt = cont.prepareStatement(sql);
		
		//pstmt.setString(1, getIsbn());
		
		rs = pstmt.executeQuery();
				
				
		while(rs.next()){
			System.out.println(rs.getString(1));
			System.out.println(isbn);
			if(rs.getString("isbn").trim().equals(isbn)){
				System.out.println("TRUE");
			}
			if(rs.getString(1).trim().equals(isbn)){						
				System.out.println("timepass");
			Order ord = new Order(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));
			ar.add(ord);
			}
		}
		
		return ar;
		
	}

}
