<%@page import="com.cg.model.Library"%>
<%@page import="com.cg.model.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Book</title>
</head>
<body>
<br>
<br>
Book Found! 
<br>
<table border="2">
<tr>
<th> Library Id </th>
<th> Library Name </th>
<th> Book Name </th>
<th> Book Id </th>
<th> Publisher </th>
<th> Author </th>
</tr>
<tr>
  <td>${libraryId}</td> 
  <td>${libraryName}</td> 
  <td>${bookName}</td> 
  <td>${bookId}</td> 
  <td>${publisher}</td> 
  <td>${author}</td>
</tr>
</table>
<br> <br>
<a href= "index.jsp"> Go to Home </a>
</body>
</html>