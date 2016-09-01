<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.ArrayList" %>
<%@ page import = "Model.Book" %>
<%@ page import = "java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Barns & Nobbel</title>
<link rel="shortcut icon" href="favicon.gif" type="image/x-icon"/>
<link rel="stylesheet" type="text/css" href="style.css"/>
</head>
<body>
<div id="container">

<div id="banner">

<div id="title">
<h1>Barns & Nobbel</h1>
<h2>A complete bookstore.</h2>
</div>


<ul class="nav">
<li><a href="order.jsp">Order</a></li>
<li><a href="cust.jsp">Customer</a></li>
<li><a href="book.jsp">Book</a>
</ul>

</div>

<div id="mainContent">


<div class="article">

<%  ArrayList<Book> array = (ArrayList<Book>)request.getAttribute("book"); %>
<br>
 <br>
<table border = 1>
<tr> 

<td>ISBN </td>
<td>Title</td>
<td>Author</td>
</tr>
<% Iterator it = array.iterator(); 
while(it.hasNext()) {
	Book or = (Book) it.next();%>

 <tr>
	<td> <%=or.getIsbn() %> </td>
	<td> <%=or.getTitle() %> </td>
	<td> <%=or.getAuthor() %> </td>
</tr>

<%} %>
</table>
<br>
<br>
</div>

</div>

</div>

</body>
</html>