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
<h1><a href="index.html">Barns & Nobbel</a></h1>
<h2>A complete bookstore.</h2>
</div>

<div id="mainContent">

<div class="article">

<form action="MainController" method="post">
<br>
<table align = "center">
<tr><td>Invalid combination of Username & Password</td></tr>
<tr>
<td> Name </td>
<td> <input type = "text" name ="name"></td>
</tr>
<tr>
</tr>
<tr>
<td>Password</td>
<td> <input type ="text" name = "password"> </td>
</tr>
<tr></tr>

<tr><td><input align="middle" type = "submit" value="login"></td></tr> 
<input type="hidden" name="para" value="lhidden">
</table>

</form>
</div>

</div>

</div>

</body>
</html>