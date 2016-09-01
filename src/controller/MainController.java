package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Book;
import Model.Customer;
import Model.Order;
import Model.User;

/**
 * Servlet implementation class MainController
 */

public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MainController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		String hidden = request.getParameter("para");
		String isbn = request.getParameter("isbn");
		String cid = request.getParameter("cid");
		String bisbn = request.getParameter("bisbn");
		User user = new User();
		
		if(hidden.equals("lhidden")){
		user.setName(name);
		user.setPassword(pass);
		
		boolean ck = false;
		try {
			ck = user.check();
			System.out.println(ck);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			if(ck){
			request.setAttribute("name", name);
			RequestDispatcher rd = request.getRequestDispatcher("/order.jsp");
			rd.forward(request, response);			
				
			}else{
				RequestDispatcher rd = request.getRequestDispatcher("/fail.jsp");
				rd.forward(request,response);
				}
		}
		
		if(hidden.equals("bhidden")){
			
			Order or = new Order();
			ArrayList <Order> ar = new ArrayList<Order>();
			//ResultSet rs =null;
			or.setIsbn(isbn);
			
			try {
				ar = or.bsearch();
				/*while(rs.next()){
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
				}*/
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Iterator it = ar.iterator();
			while(it.hasNext()){
				Order ore = (Order) it.next();
				System.out.println(ore.getIsbn());
				System.out.println(ore.getCid());
			}
		
			request.setAttribute("resultset", ar);
			RequestDispatcher rd = request.getRequestDispatcher("/seorder.jsp");
			rd.forward(request, response);
			
		}
		
		if(hidden.equals("chidden")){
		
			Customer cus = new Customer();
			ArrayList<Customer> car = new ArrayList<Customer>();
			cus.setCid(cid);
			
			try {
				car = cus.csearch();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			request.setAttribute("custo", car);
			RequestDispatcher rd = request.getRequestDispatcher("/secust.jsp");
			rd.forward(request, response);
		}
		if(hidden.equals("bookhidden")){
			
			Book bk = new Book();
			ArrayList<Book> bar = new ArrayList<Book>();
			bk.setIsbn(bisbn);
			
			try {
				bar = bk.bsearch();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			request.setAttribute("book", bar);
			RequestDispatcher rd = request.getRequestDispatcher("/sebook.jsp");
			rd.forward(request, response);
		}
		
	}
}