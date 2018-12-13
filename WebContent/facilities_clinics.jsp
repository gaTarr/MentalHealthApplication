<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Facilities and Clinics in Iowa</title>
<script src="https://unpkg.com/react@16/umd/react.production.min.js"></script>
<script
	src="https://unpkg.com/react-dom@16/umd/react-dom.development.js"></script>
<script src="index.js"></script>
</head>
<body>
	<form method="post" action="FacilitiesServlet"></form>
	<form method="post" action="ClinicsServlet"></form>
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
				<c:forEach items="${requestScope.facilities}"
					var="currentfacilities">
					<tr>
						<th>${currentfacilities.name}</th>
						<th>${currentfacilities.city}</th>
						<th>${currentfacilities.state}</th>
						<th>${currentfacilities.webaddress}</th>
					</tr>
				</c:forEach>
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
					<th>Internet Link for Outpatient Clinic or Mental Health
						Professional</th>
				</tr>
				<c:forEach items="${requestScope.clinics}" var="currentclinics">
					<tr>
						<th>${currentclinics.clinicName}</th>
						<th>${currentclinics.city}</th>
						<th>${currentclinics.state}</th>
						<th>${currentclinics.webaddress}</th>
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