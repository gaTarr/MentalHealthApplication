<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create User Account</title>
</head>
<body>
  <form method="post" action="newUserServlet">
  Username: <input type ="text" name = "user" >
  Password: <input type ="text" name = "pass" >
  <!-- <input type = "hidden" name = "score" value= ${session.getAttribute("initialScore")}>  -->
  <input type = "submit" value="Save New Account">
  </form>

</body>
</html>