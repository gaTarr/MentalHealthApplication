
<!DOCTYPE html>
<html>
<title>Mental Health</title>
<script>

	function totalIt() {

		var tot = 0;
    
		for(i = 0; i < 17; i++) {
			tot = tot + parseInt(document.getElementById("q" + i).selectedIndex);
		}
		
		document.getElementById("txtTotal").value = tot;
	
		document.getElementById('score').value = tot;
		
		document.getElementById('loginScore').value = tot;


		
	}

</script>
<script src= "https://cdn.zingchart.com/zingchart.min.js"></script>


<style>
	.border {
		border-style: solid;
		padding-top: 5px;
		padding-bottom: 5px;
		padding-left: 3px;
		margin-right: 200px;
	}
	.spacing {
		padding-right: 100px;
	}
	.makeCenter {
    	float: left;
    	width: 33%;
	}
	.bord {
		border-style: solid;
		padding-top: 5px;
		padding-bottom: 5px;
		padding-left: 3px;
		width: 35%;
	}
</style>

<head>
<meta charset="UTF-8">
<title>Mental Health</title>
</head>

<header>
<h1>Mental Health Questionnaire</h1>
<h2>This webpage is to test if you have depression, and if so, how severe it is.</h2>
</header>
<body>
	<p>
		<label>Depressed Mood: (Gloomy attitude, pessimism about the future, feeling of sadness, tendency to weep) </label> <br>
		<select id = "q0">
			<option value="0" selected>Absent</option>
			<option value="1">Sadness etc.</option>
			<option value="2">Occasional weeping</option>
			<option value="3">Frequent symptoms</option>
			<option value="4">Extreme symptoms</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Feelings of Guilt </label> <br>
		<select id = "q1">
			<option value="0" selected>Absent</option>
			<option value="1">Self-reproach, feels he/she has let people down</option>
			<option value="2">Ideas of guilt</option>
			<option value="3">Present illness is punishment; delusions of guilt</option>
			<option value="4">Hallucinations of guilt</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Suicide </label> <br>
		<select id = "q2">
			<option value="0" selected>Absent</option>
			<option value="1">Feels life is not worth living</option>
			<option value="2">Wishes he/she were dead</option>
			<option value="3">Suicidal ideas or gestures</option>
			<option value="4">Attempts at suicide</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Insomnia - Inital (Difficulty in falling asleep) </label> <br>
		<select id = "q3">
			<option value="0" selected>Absent</option>
			<option value="1">Occasional</option>
			<option value="2">Frequent</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Insomnia - Middle (Complains of being restless and disturbed during the night. Waking during the night) </label> <br>
		<select id = "q4">
			<option value="0" selected>Absent</option>
			<option value="1">Occasional</option>
			<option value="2">Frequent</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Insomnia - Delayed (Waking in early hours of the morning and unable to fall asleep again) </label> <br>
		<select id = "q5">
			<option value="0" selected>Absent</option>
			<option value="1">Occasional</option>
			<option value="2">Frequent</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Work and Interests </label> <br>
		<select id = "q6">
			<option value="0" selected>No difficulty</option>
			<option value="1">Feelings of incapacity, listlessness, indecision, and vacillation</option>
			<option value="2">Loss of interest in hobbies, decreased social activities</option>
			<option value="3">Productivity decreased</option>
			<option value="4">Unable to work. Stopped working because of present illness only. </option>
			<option disabled style="font-style:italic"> (Absence from work after treatment or recovery may rate a lower score)</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Retardation (Slowness of thought, speech, and activity; apathy; stupor)</label> <br>
		<select id = "q7">
			<option value="0" selected>Absent</option>
			<option value="1">Slight retardation at interview</option>
			<option value="2">Obvious retardation at interview</option>
			<option value="3">Interview difficult</option>
			<option value="4">Complete stupor</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Agitation (Restlessness associated with anxiety)</label> <br>
		<select id = "q8">
			<option value="0" selected>Absent</option>
			<option value="1">Occasional</option>
			<option value="2">Frequent</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Anxiety - Psychic</label> <br>
		<select id = "q9">
			<option value="0" selected>No difficulty</option>
			<option value="1">Tension and irritability</option>
			<option value="2">Worrying about minor matters</option>
			<option value="3">Apprehensive attitude</option>
			<option value="4">Fears</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Anxiety - Somatic</label> <br>
		<select id = "q10">
			<option value="0" selected>Absent</option>
			<option value="1">Mild</option>
			<option value="2">Moderate</option>
			<option value="3">Severe</option>
			<option value="4">Incapacitating</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Somatic Symptoms - Gastrointestinal (Loss of appetite, heavy feeling in abdomen; constipation)</label> <br>
		<select id = "q11">
			<option value="0" selected>Absent</option>
			<option value="1">Mild</option>
			<option value="2">Severe</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Somatic Symptoms - General (Heaviness in limbs, back or head; diffuse backache; loss of energy and fatiguability)</label> <br>
		<select id = "q12">
			<option value="0" selected>Absent</option>
			<option value="1">Mild</option>
			<option value="2">Severe</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Genital Symptoms (Loss of libido, menstrual disturbances)</label> <br>
		<select id = "q13">
			<option value="0" selected>Absent</option>
			<option value="1">Mild</option>
			<option value="2">Severe</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Hypochondriasis</label> <br>
		<select id = "q14">
			<option value="0" selected>Not present</option>
			<option value="1">Self-absorption (bodily)</option>
			<option value="2">Preoccupation with health</option>
			<option value="3">Querulous attitude</option>
			<option value="4">Hypochondriacal delusions</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Weight Loss</label> <br>
		<select id = "q15">
			<option value="0" selected>No weight loss</option>
			<option value="1">Slight</option>
			<option value="2">Obvious or severe</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Insight (Insight must be interpreted in terms of patient's understanding and background)</label> <br>
		<select id = "q16">
			<option value="0" selected>No loss</option>
			<option value="1">Partial or doubtfull loss</option>
			<option value="2">Loss of insight</option>
		</select> 
	</p> <br>
	<div class="bord">
		<label>Total Items 1 to 17</label><br> <br>
		<label>0-7 Normal</label><br>
		<label>8-13 Mild depression</label><br>
		<label>14-18 Moderate Depression</label><br>
		<label>19-22 Severe Depression</label><br>
		<label>>= 23 Very Severe Depression</label><br>
		<input type="text" id="txtTotal" readonly><button id = "btnTotal" onclick = "totalIt();">Total 1-17</button> <br>
	</div>
	
	<p>
		<label> Diurnal Variation</label> <br>
		<select id = "q17">
			<option value="0" selected>No variation</option>
			<option value="1">Mild variation</option>
			<option value="2">Severe variation</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Depresonalization and Derealization (feelings of unreality, nihilistic ideas)</label> <br>
		<select id = "q18">
			<option value="0" selected>Absent</option>
			<option value="1">Mild</option>
			<option value="2">Moderate</option>
			<option value="3">Severe</option>
			<option value="4">Incapacitating</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Paranoid Symptoms (Not with a depressive quality)</label> <br>
		<select id = "q19">
			<option value="0" selected>None</option>
			<option value="1">Suspicious</option>
			<option value="2">Ideas of reference</option>
			<option value="3">Delusions of reference and persecution</option>
			<option value="4">Hallucinations, persecutory</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	<p>
		<label> Obsessional Symptoms (Obsessive thoughts and compulsions against which the patient struggles)</label> <br>
		<select id = "q20">
			<option value="0" selected>Absent</option>
			<option value="1">Mild</option>
			<option value="2">Severe</option>
		</select> 
	</p>
	<label> ------------------------------------------------- </label> <br>
	
	<br>
<form action="getScoreServlet" method="post">
<input type="hidden" name="score" id="score" value="notset" />
<input type = "submit" value = "Create an Account">
 </form><br />
 <script src="Graph.js"></script>
<script type="text/javascript" src="https://cdn.zingchart.com/zingchart.min.js"></script> 
  <div id="myChart"></div> 
</body>
	<div class="border">
		<form action="loginServlet" method="post">
			<input type="hidden" name="loginScore" id="loginScore">
			<label>Login: Username: </label><input type="text" id="userName" name="userName"><label> Password: </label><input type="text" id="userPassword" name="userPassword"><button id="btnLogin">Submit</button>
			<label>         Sign-up</label>
		</form>
	</div> <br> <br> 
</body>
<footer>
		<label class="makeCenter">Medications</label>
		<label class="makeCenter">Clinics</label>
		<label class="makeCenter">Inpatient Facilities</label>
</footer>

</html>