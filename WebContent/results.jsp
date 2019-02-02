<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- author - Carl Phillips -->
<!-- This page serves to show the user his results and past results after taking the test.
	 It retrieves the information from the database and shows it in a bar graph. 
	 It gets the scores in a string from the attribute allScores and the GraphResults.js file
	 takes it and converts it into an array, which can be used by the graph. 
	 The graph is in a div with the id myChart -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Score Results</title>
<% String userScores = (String)request.getAttribute("allScores"); %>
<link rel = "stylesheet"
   type = "text/css"
   href = "GlobalStyle.css" />
</head>
<script src= "https://cdn.zingchart.com/zingchart.min.js"></script>
<body>
	<br />
	<br />
</body>
<script src= "https://cdn.zingchart.com/zingchart.min.js"></script>
<script type="text/javascript" src="https://cdn.zingchart.com/zingchart.min.js"></script> 
<input type="hidden" name="score" id="score" value=<%=userScores %> />
 <script src="GraphResults.js"></script>
 <div id="myChart"></div>
<footer>
		<a href="index.jsp" class="makeCenter">Home</a>
		<a href="MedicationsServlet" class="makeCenter">Medications</a>
		<a href="FacilitiesServlet" class="makeCenter">Clinics and Facilities</a>
</footer>
</html>