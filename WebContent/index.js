import React from 'react';
import ReactDOM from 'react-dom';
import Chart from 'chart.js';
import { Bar } from 'react-chartjs-2';
import './graph.css';

var scores = [10, 19, 29, 39, 49, 59, 69, 79, 89, 99];
var count = [];
var colors = [];
var border= [];

class BarGraph extends React {
    constructor(props) {
        super(props);
        this.state = {
            chartData: {
                labels: count,
                datasets: [
                    {
                        label: 'Data',
                        data: scores,
                        backgroundColor: colors,
                        borderColor: border,
                        borderWidth: 2,
                    }
                ],
                options: {
                    legend: {
                        display: false
                    },
                    scales: {
                        yAxes: [{
                            stacked: true,
                            gridLines: {
                                display: true,
                                color: "rgba(201,201,201)"
                            },
                            ticks: {
                                beginAtZero: true,
                                max: 100
                            }
                        }]
                    }
                }
            }
        }
    }

    render() {
        for (var i = 0; i < scores.length; i++) {
            var ref1 = 0;
            var ref2 = 0;
            if (scores[i] <= 10) {
                ref1 = 255;
                ref2 = 30;
            } else if (scores[i] <= 20) {
                ref1 = 220;
                ref2 = 53;
            } else if (scores[i] <= 30) {
                ref1 = 180;
                ref2 = 75;
            } else if (scores[i] <= 40) {
                ref1 = 150;
                ref2 = 87;
            } else if (scores[i] <= 50) {
                ref1 = 115;
                ref2 = 100;
            } else if (scores[i] <= 60) {
                ref1 = 90;
                ref2 = 120;
            } else if (scores[i] <= 70) {
                ref1 = 50;
                ref2 = 145;
            } else if (scores[i] <= 80) {
                ref1 = 25
                ref2 = 180;
            } else if (scores[i] <= 90) {
                ref1 = 0;
                ref2 = 220;
            } else if (scores[i] <= 100) {
                ref1 = 0;
                ref2 = 255;
            }
            colors[i] = 'rgba(' + ref2 + ',' + ref1 + ',0, 0.7)';
            border[i] = 'rgba(' + ref2 + ',' + ref1 + ',0, 1)';
            count[i] = i + 1;
        }
                

        return (
            <Bar
                data={this.state.chartData}
                options={this.state.chartData.options}
                />
            );
        }
    };

    export default Chart;

ReactDOM.render(
    React.createElement(BarGraph, null), 
    document.getElementById('root')
);