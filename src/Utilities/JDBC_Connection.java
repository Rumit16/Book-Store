package Utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBC_Connection {
	
	public Connection connnect() {
		
	try{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
	} catch(ClassNotFoundException e){
		
		System.out.println("Exception");
		
	}
	
	Connection con = null;
	// Statement stmt = null;
	
	try {
		con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","SYSTEM","rumit");
		System.out.println("te");
		
		if(con!= null){
			System.out.println("Connnnn");
		}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(con!= null){
			return con;
		}else{
			return null;
		}
				
	}

	
}
