<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function addUser()
{
	document.fn.action="reg";
	document.fn.submit();
	
	}
function editUser()
{
	document.fn.action="edit";
	document.fn.submit();
	
	}
</script>
</head>
<body>
<h1>Welcome to cjc..!!!</h1>
<form  name="fn">
<table border="1">
<tr>
<th>Sid</th>
<th>Name</th>
<th>Uname</th>
<th>Password</th>
<th>Mobile.No</th>
<th>Address</th>
</tr>
<c:forEach items="${data}" var="stud">
<tr>
<td><input type="radio" name="sid" value="${stud.sid }"></td>
<td>${stud.name}</td>
<td>${stud.uname}</td>
<td>${stud.pass}</td>
<td>${stud.mobNo}</td>
<td>${stud.addr}</td>


</tr>

</c:forEach>
</table>
<table>
<tr>
<td><input type="button" value="ADD" onclick="addUser()"></td>
</tr>
<tr>
<td><input type="button" value="UPDATE" onclick="editUser()"></td>
</tr><tr>
<td><input type="button" value="DELETE" onclick="deleteUser()"></td>
</tr>
</table>
</form>
</body>
</html>