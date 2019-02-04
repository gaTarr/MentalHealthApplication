// @author - Carl Phillips
// @description - this draws the bar graph using zingchart

setTimeout(window.onload = function() {  
	var scores = " ";
	scores = document.getElementById("score").value;				//This gets the score in a string
	var count = [];

	var scoreString = scores.split(",");							//Splits the string by the comma 
	console.log(scoreString);
	var arrScores = [];
	for(var i = 0; i < scoreString.length; i++) {					//loop that iterates through the scoreString array
		arrScores[i] = parseInt(scoreString[i]);					//parses the string array to an integer array
		console.log(arrScores[i]);
	}

	for (var i = 0; i < scores.length; i++) {						//counts the length of the array to use an array of numbers as labels
		count[i] = i + 1;
	}
	  zingchart.render({											//creates the chart
	    id: "myChart",
	    width: "90%",
	    height: 500,
	    data: {
	      "type": "bar",
	      "title": {
	        "text": "Test Results"
	      },
	      "scale-x": {
	        "labels": count
          },
          "scale-y": {
            "values": "0:50:2"
          },
	      "plot": {
	        "line-width": 1
	      },
	     "series": [{
			"values": arrScores										//populates the bar graph with the values given by the array
	      }]
	    }
	  });
	}, 100);