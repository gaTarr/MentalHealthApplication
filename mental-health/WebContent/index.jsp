<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Mental Health</title>
<script>
	function totalIt() {
		var tot = 0;
		tot = tot + parseInt(document.getElementById("Q0").value);
		tot = tot + parseInt(document.getElementById("Q1").value);
		tot = tot + parseInt(document.getElementById("Q2").value);
		tot = tot + parseInt(document.getElementById("Q3").value);
		tot = tot + parseInt(document.getElementById("Q4").value);
		tot = tot + parseInt(document.getElementById("Q5").value);
		tot = tot + parseInt(document.getElementById("Q6").value);
		tot = tot + parseInt(document.getElementById("Q7").value);
		tot = tot + parseInt(document.getElementById("Q8").value);
		
		document.getElementById("txtTotal").value = tot;
	}
</script>
<head>
<meta charset="ISO-8859-1">
<title>Mental Health</title>
</head>
<body>
	<h1>Hello! This is a JSP page!</h1>
	<label>Answer between 1 and 4; 4 being the strongest feeling.</label>
	<br>
	<label>Little interest or pleasure in doing things: </label>
	<input type="text" name="Q0"> <br>
	<label>Feeling down, depressed, or hopeless: </label>
	<input type="text" name="Q1"> <br>
	<label>Trouble falling or staying asleep, or sleeping too much: </label>
	<input type="text" name="Q2"> <br>
	<label>Feeling tired or having little energy: </label>
	<input type="text" name="Q3"> <br>
	<label>Poor appetite or overeating: </label>
	<input type="text" name="Q4"> <br>
	<label>Feeling bad about yourself - or that you are a failure or have let yourself or your family down: </label>
	<input type="text" name="Q5"> <br>
	<label>Trouble concentrating on things, such as reading the newspaper or watching television: </label>
	<input type="text" name="Q6"> <br>
	<label>Moving or speaking so slowly that other people could have noticed: </label>
	<input type="text" name="Q7"> <br>
	<label>Thoughts that you would be better off dead or of hurting yourself: </label>
	<input type="text" name="Q8"> <br>
	<label>If you've had any days with issues above, how difficult have these problems made it for you at work, home, school, or with other people: </label>
	<input type="text" name="Q9"> <br>
	<label>Total: </label> <input type="text" name="txtTotal"> 
	<button name="btnTotal" onClick="totalIt()">Total</button><br>
</body>
</html>