<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"% isELIgnored="false" %>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="2px">
<tr>
<th>id</th>
<th>name</th>
<th>email</th>
<th>contact</th>
</tr>

<c:forEach var ="emp" items = "${emps}">

<tr>
<td>${emp.employeeId}</td>
<td>${emp.employeeName}</td>
<td>${emp.employeeEmail}</td>
<td>${emp.employeeContact}</td>
</tr>
</c:forEach>




</table>

</body>
</html>