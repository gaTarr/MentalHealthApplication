setTimeout(window.onload = function() {  
	var scores = " ";
	scores = document.getElementById("score").value;
	var count = [];

	var scoreString = scores.split(",");
	console.log(scoreString);
	var arrScores = [];
	for(var i = 0; i < scoreString.length; i++) {
		arrScores[i] = parseInt(scoreString[i]);
		console.log(arrScores[i]);
	}

	for (var i = 0; i < scores.length; i++) {
		count[i] = i + 1;
	}
	  zingchart.render({
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
			"values": arrScores
	      }]
	    }
	  });
	}, 100);