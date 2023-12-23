import { Component, OnInit } from '@angular/core';
import { ECharts } from 'echarts';
import echarts from 'echarts/types/dist/echarts';
import { BarChart, LineChart, LinesChart } from "echarts/charts";
import { TooltipComponent, GridComponent, LegendComponent, } from "echarts/components";

@Component({
  selector: 'app-in-amount-graph',
  templateUrl: './in-amount-graph.component.html',
  styleUrl: './in-amount-graph.component.scss'
})
export class InAmountGraphComponent implements OnInit {
  readonly echartsExtentions: any[];
  echartsOptions: any = {};



  constructor() {
    this.echartsExtentions = [BarChart, TooltipComponent, GridComponent, LegendComponent];
  }

  ngOnInit() {
    this.echartsOptions = {
      LineChart: {

      },
      tooltip: {
        trigger: "axis",
        axisPointer: {
          type: "shadow"
        }
      },
      grid: {
        left: "3%",
        right: "4%",
        bottom: "8%",
        top: "3%",
        containLabel: true
      },
      yAxis: {
        type: "value"
      },
      xAxis: {
        type: "category",
        data: ["sat", "sun", "mon", "tue", "wed", "thu", "fri"],
        axisLabel: {
          interval: 0,
          rotate: 15
        }
      },
      legend: {
        data: ["Esta semana",
          "Semana pasada"],
        bottom: 0
      },
      series: [
        {
          name: "Esta semana",
          type: "bar",
          data: [10, 15, 17, 4, 15, 31, 2]

        },
        {
          name: "Semana pasada",
          type: "bar",
          data: [1, 17, 12, 11, 40, 3, 21]
        }
      ]
    };
  }
}
