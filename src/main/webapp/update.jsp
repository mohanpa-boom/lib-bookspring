<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<form action="update" name="get">
Book Id : <input type ="text" name ="bookId" value="<%=request.getParameter("bookId")%>" readonly> <br>
Enter Book name: <input type="text" name="bookName"><br>
Enter Publisher name : <input type ="text" name="publisher"><br>
Enter Author : <input type="text" name="author"><br>
Click here to update <input type = "submit" value="click">
<br>
</form>
</body>
</html>