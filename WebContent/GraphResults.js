setTimeout(window.onload = function() {  
    var scores = [test];
	var count = [];

    console.log(scores);
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
			"values": scores
	      }]
	    }
	  });
	}, 100);