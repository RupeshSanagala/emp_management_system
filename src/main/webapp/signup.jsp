<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute ="emp" action ="saveemployee">
NAME: <form:input path ="empName"/><br>
EMAIL: <form:input path ="empEmail"/><br>
CONTACT:<form:input path="contact"/><br>
PASSWORD:<form:input path="password"/><br>
<input type = "submit">
</form:form>

</body>
</html>