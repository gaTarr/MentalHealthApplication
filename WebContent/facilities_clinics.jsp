<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Facilities and Clinics</title>
<link rel = "stylesheet"
   type = "text/css"
   href = "GlobalStyle.css" />
<script src="https://unpkg.com/react@16/umd/react.production.min.js"></script>
<script src="https://unpkg.com/react-dom@16/umd/react-dom.development.js"></script>
<script src="index.js"></script>
</head>
<body>
	<form method="post" action=""></form>
	<div class="container">
		<div class="table-responsive">
			<p>
				<b>List of Inpatient Facilities in Iowa</b>
			</p>
			<table>
				<tr>
					<th>Name of Inpatient Facility</th>
					<th>City</th>
					<th>State</th>
					<th>Internet Link for Inpatient Facility</th>
				</tr>
				<tr>
					<th>name link needed</th>
					<th>city link needed</th>
					<th>state link needed</th>
					<th>webaddress link needed</th>
				</tr>
			</table>
			<p>
				<b>List of Outpatient Clinics and Mental Health Professionals in
					Iowa</b>
			</p>
			<table>
				<tr>
					<th>Name of Outpatient Clinic or Mental Health Professional</th>
					<th>City</th>
					<th>State</th>
					<th>Internet Link for Outpatient Clinic or Mental Health Professional</th>
				</tr>
				<tr>
					<th>clinicName link needed</th>
					<th>city link needed</th>
					<th>state link needed</th>
					<th>webaddress link needed</th>
				</tr>

			</table>
		</div>
	</div>

</body>
<footer>
		<a href="medications.jsp" class="makeCenter">Medications</a>
		<a href="index.jsp" class="makeCenter">Home</a>
</footer>
</html>