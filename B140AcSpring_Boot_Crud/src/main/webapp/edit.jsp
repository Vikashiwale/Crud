<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updatestud">
<input type="hidden" name="sid" value="${data.sid }">
<table border="1">
<tr>
<th>Name:-</th>
<td><input type="text" name="name" value="${data.name }"></td>
</tr>
<tr>
<th>Uname:-</th>
<td><input type="text" name="uname" value="${data.uname }"></td>
</tr><tr>
<th>Password:-</th>
<td><input type="text" name="pass" value="${data.pass }"></td>
</tr><tr>
<th>Mobile No:-</th>
<td><input type="text" name="mobNo" value="${data.mobNo }"></td>
</tr><tr>
<th>Addresss:-</th>
<td><input type="text" name="addr" value="${data.addr }"></td>
</tr>
<td><input type="submit" value="update here">
</table>



</form>
</body>
</html>