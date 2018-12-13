<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Medications</title>
<script src="https://unpkg.com/react@16/umd/react.production.min.js"></script>
<script
	src="https://unpkg.com/react-dom@16/umd/react-dom.development.js"></script>
<script src="index.js"></script>
</head>
<body>
	<form method="post" action="MedicationsServlet"></form>
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
				<c:forEach items="${requestScope.medications}"
					var="currentmedications">
				<tr>
					<th>${currentmedications.brandName}</th>
					<th>${currentmedications.genericName}</th>
					<th>${currentmedications.type}</th>
					<th>${currentmedications.webaddress}</th>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
 <footer>
 		<a href="index.jsp" class="makeCenter">Home</a>
		<a href="medications.jsp" class="makeCenter">Medications</a>
		<a href="facilities_clinics.jsp" class="makeCenter">Facilites and Clinics</a>
</footer>
</html>