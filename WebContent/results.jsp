<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script src= "https://cdn.zingchart.com/zingchart.min.js"></script>
<body>
hello
</body>
<script src= "https://cdn.zingchart.com/zingchart.min.js"></script>
<script type="text/javascript" src="https://cdn.zingchart.com/zingchart.min.js"></script> 
<% int[] yourScores = (int []) request.getAttribute("allScores"); %>

<%= request.getAttribute("allScores") %>

 <script src="GraphResults.js"></script>
 <div id="myChart"></div>
</html>