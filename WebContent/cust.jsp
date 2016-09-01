<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>classic-ish</title>
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
<li><a href="#" id="currentpage">Customer</a></li>
<li><a href="book.jsp">Book</a>
</ul>

</div>


<div id="mainContent">


<div class="article">

<h3>Search Customer</h3>
<form action="MainController" method = "post">

<table border = "1">
<tr>
<td>
<p align="center"> Enter Customer Number :
</td>
<td> 
<input type = "text" name = "cid"></p>
</td>
</tr>
<tr>
<td>
<input align="middle" type ="submit" value="submit">
</td>
</tr>
</table>
<input type="hidden" name ="para" value="chidden">

</form>

</div>

</div>

</div>
</body>
</html>