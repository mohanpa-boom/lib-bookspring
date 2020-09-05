<%@page import="com.cg.model.Book"%>
<%@page import="com.cg.dao.Dao"%>
<%@page import="java.util.List"%>
<html>
<body>
<h2>Library Form</h2>
<form name="post" action="add">
Library Id :<br>
<input type= "text" name ="libraryId"> <br> <br>
Library Name: <br>
<input type= "text" name ="libraryName"> <br> <br>
Book Name : <br>
<input type ="text" name= "bookName"><br> <br>
Book Id: <br>
 <input type ="text" name="bookId"><br> <br>
Publisher :<br>
<input type="text" name="publisher"><br> <br>
Author: <br>
<input type="text" name="author"><br><br>
<input type ="submit"> 
<br> 
</form>
<form action="find" name="get">
Find by id: <br>
<input type="text" name="bookId"> <br> <br>
<input type ="submit"> 
</form>
<table border="2">
<tr>
<th> Library Id </th>
<th> Library Name </th>
<th> Book Name </th>
<th> Book Id </th>
<th> Publisher </th>
<th> Author </th>
</tr>

<% 
Dao dao = new Dao();
List<Book> books = dao.showAllBooks();
			%> 
			<% 
				for (Book b : books) { 
			%> 
			<tr> 
				<td><%=b.getLibrary().getLibraryId()%></td> 
				<td><%=b.getLibrary().getLibraryName()%></td> 
				<td><%=b.getBookName()%></td> 
				<td><%=b.getBookId()%></td> 
				<td><%=b.getPublisher()%></td> 
				<td><%=b.getAuthor()%></td>
				<td>
                <form action="update" name="post">
                <a href="update.jsp?bookId=<%=b.getBookId()%>">Update</a>
                </form>
                </td>
                <td>
                <form action="delete" name="get">
                <a href="delete?bookId=<%=b.getBookId()%>">Delete</a>
                </form>
                 </td>
			</tr> 
			<% 
				} 
			%> 
			</table>
</body>
</html>
