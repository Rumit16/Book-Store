package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Utilities.JDBC_Connection;

public class Book {
	String isbn;
	String title;
	String author;
	public Book(String string, String string2, String string3) {
		this.isbn = string;
		this.title = string2;
		this.author = string3;
		
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public ArrayList<Book> bsearch() throws SQLException{
		ArrayList<Book> ar = new ArrayList<Book>();
		JDBC_Connection connection = new JDBC_Connection();
		
		Connection cont =null;
		Statement stmt = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		String sql = "select * from books";
		
		cont = connection.connnect();
		pstmt = cont.prepareStatement(sql);
		
			
		rs = pstmt.executeQuery();
		
		
		while(rs.next()){
			System.out.println(rs.getString(1));
			System.out.println(isbn);
			/*if(rs.getString("isbn").trim().equals(isbn)){
				System.out.println("TRUE");
			}*/
			
			if(rs.getString(1).trim().equals(isbn)){						
				System.out.println("vaues: "+rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
				Book bk = new Book(rs.getString(1),rs.getString(2),rs.getString(3));
				ar.add(bk);
			}
		}
		
		return ar;
	}

}
