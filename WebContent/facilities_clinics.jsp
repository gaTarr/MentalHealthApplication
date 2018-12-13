<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Facilities and Clinics in Iowa</title>
<link rel = "stylesheet"
   type = "text/css"
   href = "GlobalStyle.css" />
</head>
<body>
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
						<td>${currentfacilities.name}</td>
						<td>${currentfacilities.city}</td>
						<td>${currentfacilities.state}</td>
						<td>${currentfacilities.webaddress}</td>
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
						<td>${currentclinics.clinicName}</td>
						<td>${currentclinics.city}</td>
						<td>${currentclinics.state}</td>
						<td>${currentclinics.webaddress}</td>
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