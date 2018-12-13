<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Medications</title>
<link rel = "stylesheet"
   type = "text/css"
   href = "GlobalStyle.css" />
</head>
<body>
	<div class="container">
		<div class="table-responsive">
			<p>
				<b>List of Current Anti-Depressant Medications</b>
			</p>

			<table>
				<tr>
					<th>Brand Name</th>
					<th>Generic Name</th>
					<th>Class of Medication</th>
					<th>Internet Link for Medication</th>
				</tr>
				<c:forEach items="${requestScope.medications}" var="currentmedications">
				<tr>
					<td>${currentmedications.brandName}</td>
					<td>${currentmedications.genericName}</td>
					<td>${currentmedications.type}</td>
					<td>${currentmedications.webaddress}</td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
<footer>
		<a href="index.jsp" class="makeCenter">Home</a>
		<a href="MedicationsServlet" class="makeCenter">Medications</a>
		<a href="FacilitiesServlet" class="makeCenter">Clinics and Facilities</a>
</footer>
</html>