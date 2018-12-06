<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create User Account</title>
<% String userScore = (String)request.getAttribute("initialScore"); %>
</head>
<body>
  <form method="post" action="newUserServlet">
  Username: <input type ="text" name = "user" >
  Password: <input type ="text" name = "pass" >
  <input type = "text" name = "score" value="<%=userScore %>"> 
  <input type = "submit" value="Save New Account">
  </form>

</body>
</html>