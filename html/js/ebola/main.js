/**
 * Main module
 *
 * "define" is for require.js
 * - 1st arg is the name of this module
 * - 2nd arg is the list of dependencies
 * - 3rd arg is a function executed when everything is loaded, its arguments are dependencies
 *
 * All paths are relatives to the directory of this main (always ../)
 */
define("main",

    // inspinia_loader loads all dependencies for inspinia template in 1 step, from require.config below
    // controllers do not need dependencies - they don't execute until document is ready
    // chart_controller is a singleton and it is not in the factory
	["inspinia_loader_level1", "controllers/chart_controller", "controllers/factory"],

	function (inspinia_loader, chart_controller, factory) {
    // chosen init
    $(document).ready(function () {
      var config = {
              '.chosen-select'           : {},
              '.chosen-select-deselect'  : {allow_single_deselect:true},
              '.chosen-select-no-single' : {disable_search_threshold:10},
              '.chosen-select-no-results': {no_results_text:'Oops, nothing found!'},
              '.chosen-select-width'     : {width:"95%"}
      }
      for (var selector in config) {
          $(selector).chosen(config[selector]);
      }
    });

    // icheck init
    $(document).ready(function () {
      $('.i-checks').iCheck({
        checkboxClass: 'icheckbox_square-green',
        radioClass: 'iradio_square-green',
      });
    });

    // ebola button controllers
		$(document).ready(function(){

			// manage steps of the wizard
			var add_submit_effect = function () {
				$("#submit-form-effect").addClass("animated");
				$("#submit-form-effect").addClass("pulse");
			};
			var rm_submit_effect = function () {
				$("#submit-form-effect").removeAttr('class').attr('class', '');
			}
			var wizard = $("#wizard").show();
			wizard.steps({
			  onStepChanging: function (event, currentIndex, newIndex) {
					if (newIndex == 0) {
						// before login
						log_in_collapse_controller.uncollapse();
						submit_form_collapse_controller.collapse();
						chart_collapse_controller.collapse();
					} else if (newIndex == 1) {
						// after login
						log_in_collapse_controller.collapse();
						cleanup_data_form();
						add_submit_effect();
						setTimeout(function () {
							rm_submit_effect();
						}, 1000);
						submit_form_collapse_controller.uncollapse();
						chart_collapse_controller.collapse();
					} else if (newIndex == 2 | newIndex == 3) {
						// first graph
						log_in_collapse_controller.collapse();

						// set data and 1st chart
						cleanup_data_form();
						document.getElementById('ith1').value = get_first_scatter_data()[0][0];
						document.getElementById('num1').value = get_first_scatter_data()[0][1];
						document.getElementById('ith2').value = get_first_scatter_data()[1][0];
						document.getElementById('num2').value = get_first_scatter_data()[1][1];
						submit_form_collapse_controller.uncollapse();
						add_submit_effect();
						setTimeout(function () {
							rm_submit_effect();
							if (newIndex == 2) {
								submit_form_collapse_controller.collapse();
							}
							// show graph after effect
							chart_collapse_controller.uncollapse();
							var chart = chart_controller.getChartInstance();
							chart.ranges = get_first_ranges();
							chart.averages = get_first_averages();
							chart.scatter_data = get_first_scatter_data();
							chart.scatter_data_real = [];
							chart_view_update();
							document.getElementById("chart").focus();
						}, 1200);

					} else if (newIndex == 4 | newIndex == 5) {
						// second graph
						log_in_collapse_controller.collapse();

						// set data and 1st chart
						cleanup_data_form();
						document.getElementById('ith1').value = get_second_scatter_data()[0][0];
						document.getElementById('num1').value = get_second_scatter_data()[0][1];
						document.getElementById('ith2').value = get_second_scatter_data()[1][0];
						document.getElementById('num2').value = get_second_scatter_data()[1][1];
						document.getElementById('ith3').value = get_second_scatter_data()[2][0];
						document.getElementById('num3').value = get_second_scatter_data()[2][1];
						submit_form_collapse_controller.uncollapse();
						add_submit_effect();
						setTimeout(function () {
							rm_submit_effect();
							if (newIndex == 4) {
								submit_form_collapse_controller.collapse();
							}
							// show graph after effect
							chart_collapse_controller.uncollapse();
							var chart = chart_controller.getChartInstance();
							chart.ranges = get_second_ranges();
							chart.averages = get_second_averages();
							chart.scatter_data = get_second_scatter_data();
							chart.scatter_data_real = [];
							chart_view_update();
							document.getElementById("chart").focus();
						}, 1200);
					} else if (newIndex == 6) {
						// second graph
						log_in_collapse_controller.collapse();

						// set data and 1st chart
						cleanup_data_form();
						document.getElementById('ith1').value = get_third_scatter_data()[0][0];
						document.getElementById('num1').value = get_third_scatter_data()[0][1];
						document.getElementById('ith2').value = get_third_scatter_data()[1][0];
						document.getElementById('num2').value = get_third_scatter_data()[1][1];
						document.getElementById('ith3').value = get_third_scatter_data()[2][0];
						document.getElementById('num3').value = get_third_scatter_data()[2][1];
						document.getElementById('ith4').value = get_third_scatter_data()[3][0];
						document.getElementById('num4').value = get_third_scatter_data()[3][1];
						submit_form_collapse_controller.uncollapse();
						add_submit_effect();
						setTimeout(function () {
							rm_submit_effect();
							submit_form_collapse_controller.collapse();
							// show graph after effect
							chart_collapse_controller.uncollapse();
							var chart = chart_controller.getChartInstance();
							chart.ranges = get_third_ranges();
							chart.averages = get_third_averages();
							chart.scatter_data = get_third_scatter_data();
							chart.scatter_data_real = get_scatter_data_real();
							chart_view_update();
							document.getElementById("chart").focus()
						}, 1200);

					}
			    return true;
			  }
			});


			// TODO there must be a way to improve this code !!!
			var cleanup_data_form = function(data) {
				document.getElementById('ith1').value = null;
				document.getElementById('num1').value = null;
				document.getElementById('ith2').value = null;
				document.getElementById('num2').value = null;
				document.getElementById('ith3').value = null;
				document.getElementById('num3').value = null;
				document.getElementById('ith4').value = null;
				document.getElementById('num4').value = null;
				document.getElementById('ith5').value = null;
				document.getElementById('num5').value = null;
				document.getElementById('ith6').value = null;
				document.getElementById('num6').value = null;
				document.getElementById('ith7').value = null;
				document.getElementById('num7').value = null;
				document.getElementById('ith8').value = null;
				document.getElementById('num8').value = null;
			};

			// data for bubble breaker
			get_first_ranges = function() {
				return [
						[0, 0, 0],
						[5, 287.0, 353.0],
						[10, 627.0, 774.0],
						[15, 803.0, 997.0],
						[20, 890.0, 1110.0],
						[25, 1154.0, 1446.0],
						[30, 1301.0, 1639.0],
						[35, 1500.0, 1900.0],
						[40, 1584.0, 2016.0],
						[45, 1702.0, 2178.0],
						[50, 1820.0, 2340.0],
						[55, 1920.0, 2481.0],
						[60, 2036.0, 2644.0],
						[65, 2169.0, 2831.0],
						[70, 2284.0, 2996.0],
						[75, 2381.0, 3140.0],
						[80, 2494.0, 3306.0],
						[85, 2607.0, 3473.0],
						[90, 2668.0, 3572.0],
						[95, 2728.0, 3672.0],
						[100, 2839.0, 3841.0]
				]
			};

			get_first_averages = function () {
				return [
					[0, 0],
					[5, 320],
					[10, 700],
					[15, 900],
					[20, 1000],
					[25, 1300],
					[30, 1470],
					[35, 1700],
					[40, 1800],
					[45, 1940],
					[50, 2080],
					[55, 2200],
					[60, 2340],
					[65, 2500],
					[70, 2640],
					[75, 2760],
					[80, 2900],
					[85, 3040],
					[90, 3120],
					[95, 3200],
					[100, 3340]
				]
			};

			get_second_ranges = function() {
				return [
						[0, 0, 0],
						[5, 283.0, 357.0],
						[10, 609.0, 791.0],
						[15, 770.0, 1031.0],
						[20, 924.0, 1276.0],
						[25, 1155.0, 1645.0],
						[30, 1280.0, 1880.0],
						[35, 1383.0, 2097.0],
						[40, 1466.0, 2294.0],
						[45, 1622.0, 2618.0],
						[50, 1695.0, 2825.0],
						[55, 1764.0, 3036.0],
						[60, 1829.0, 3251.0],
						[65, 1904.0, 3497.0],
						[70, 2001.0, 3799.0],
						[75, 2120.0, 4161.0],
						[80, 2165.0, 4395.0],
						[85, 2219.0, 4661.0],
						[90, 2255.0, 4905.0],
						[95, 2276.0, 5125.0],
						[100, 2304.0, 5376.0]
				]
			};

			get_second_averages = function () {
				return [
					[0, 0],
					[5, 320],
					[10, 700],
					[15, 900],
					[20, 1100],
					[25, 1400],
					[30, 1580],
					[35, 1740],
					[40, 1880],
					[45, 2120],
					[50, 2260],
					[55, 2400],
					[60, 2540],
					[65, 2700],
					[70, 2900],
					[75, 3140],
					[80, 3280],
					[85, 3440],
					[90, 3580],
					[95, 3700],
					[100, 3840]
				]
			};

			get_third_ranges = function() {
				return [
						[0, 0, 0],
						[5, 281.0, 359.0],
						[10, 599.0, 802.0],
						[15, 749.0, 1051.0],
						[20, 810.0, 1190.0],
						[25, 866.0, 1334.0],
						[30, 872.0, 1408.0],
						[35, 906.0, 1534.0],
						[40, 965.0, 1715.0],
						[45, 990.0, 1850.0],
						[50, 1026.0, 2014.0],
						[55, 1044.0, 2156.0],
						[60, 1040.0, 2261.0],
						[65, 1033.0, 2367.0],
						[70, 1030.0, 2490.0],
						[75, 1035.0, 2645.0],
						[80, 1026.0, 2774.0],
						[85, 1025.0, 2935.0],
						[90, 1010.0, 3070.0],
						[95, 997.0, 3223.0],
						[100, 981.0, 3379.0]
				]
			};

			get_third_averages = function () {
				return [
					[0, 0],
					[5, 320],
					[10, 700],
					[15, 900],
					[20, 1000],
					[25, 1100],
					[30, 1140],
					[35, 1220],
					[40, 1340],
					[45, 1420],
					[50, 1520],
					[55, 1600],
					[60, 1650],
					[65, 1700],
					[70, 1760],
					[75, 1840],
					[80, 1900],
					[85, 1980],
					[90, 2040],
					[95, 2110],
					[100, 2180]
				]
			};

			get_first_scatter_data = function() {
				return [
					[4, 281],
					[11, 707]
				]
			};

			get_second_scatter_data = function() {
				return [
					[4, 281],
					[11, 707],
					[14, 873]
				]
			};

			get_third_scatter_data = function() {
				return [
					[4, 281],
					[11, 707],
					[14, 873],
					[21, 1123]
				]
			};

			get_scatter_data_real = function() {
				return [
					[4, 281],
					[11, 707],
					[14, 873],
					[21, 1123],
					[28, 1284],
					[34, 1392],
					[84, 1886],
					[95, 1992]
				]
			};

			// functions that manage the view of the chart
			var chart_view_update = (function () {

          var chart = chart_controller.getChartInstance();
          var ranges = chart.ranges,
              averages = chart.averages,
              scatter_data = chart.scatter_data,
              scatter_data_real = chart.scatter_data_real;

          $('#high-charts-container').highcharts({

              title: {
                  text: 'Number of downloads versus time'
              },

              xAxis: {
                  type: 'integer'
              },

              yAxis: {
                  title: {
                      text: null
                  }
              },

              plotOptions: {
                  series: {
                      point: {
                          events: {
                              mouseOver: function () {
                                  var chart = this.series.chart;
                                  if (!chart.lbl) {
                                      chart.lbl = chart.renderer.label('')
                                          .attr({
                                              padding: 10,
                                              r: 10,
                                              fill: Highcharts.getOptions().colors[1]
                                          })
                                          .css({
                                              color: '#FFFFFF'
                                          })
                                          .add();
                                  }
                                  chart.lbl
                                      .show()
                                      .attr({
                                          text: 'x: ' + this.x + ', y: ' + this.y
                                      });
                              }
                          }
                      },
                      events: {
                          mouseOut: function () {
                              if (this.chart.lbl) {
                                  this.chart.lbl.hide();
                              }
                          }
                      }
                  }
              },

              tooltip: {
                  enabled: false
              },

              legend: {
              },

              series: [{
                  name: '# of downloads',
                  data: averages,
                  zIndex: 1,
                  marker: {
                    radius: 0
                  }
              }, {
                  name: 'Range',
                  data: ranges,
                  type: 'arearange',
                  lineWidth: 0,
                  linkedTo: ':previous',
                  color: Highcharts.getOptions().colors[0],
                  fillOpacity: 0.3,
                  zIndex: 0
              }, {
                  name: 'data to predict',
                  type: 'scatter',
                  color: Highcharts.getOptions().colors[3],
                  marker: {
                    radius: 5
                  },
                  data: scatter_data_real
              }, {
                  name: 'data',
                  type: 'scatter',
                  color: Highcharts.getOptions().colors[4],
                  marker: {
                    radius: 5
                  },
                  data: scatter_data
              }]
          });
      });


			// controller factory
			var selected_app_controller = factory.createController("combo_controller");
			selected_app_controller.init("select-apps");
			selected_app_controller.initData(["Bubble breaker"]);

			// Login button controller
			$('#log-in').click(function(){
				return;
			});

			// Submit data controller
			$('#submit-data').click(function(){
				return;
			});

			// Get real data controller
			$('#get-real-data').click(function () {
				return;
			});

			// everything is set: make page visible
			// 1. collapse/uncollapse the different divs
			var log_in_collapse_controller = factory.createController("div_collapse_controller");
			log_in_collapse_controller.init("log-in-collapse");
			log_in_collapse_controller.uncollapse();

			var submit_form_collapse_controller = factory.createController("div_collapse_controller");
			submit_form_collapse_controller.init("submit-form-collapse");
			submit_form_collapse_controller.collapse();

			var chart_collapse_controller = factory.createController("div_collapse_controller");
			chart_collapse_controller.init("chart-collapse");
			chart_collapse_controller.collapse();
			// 2. make page visible
			document.getElementById("page-wrapper").style.visibility='visible'
			// 3. load empty chart so that it gets size
			chart_view_update();

		});

  }
);

require.config({
    paths: {
   		// all these depend on the template
    	jquery : '../jquery-2.1.1',
   		bootstrap : "../bootstrap",
   		jquerymetismenu : "../plugins/metisMenu/jquery.metisMenu",
   		jqueryslimscroll : "../plugins/slimscroll/jquery.slimscroll.min",
      inspinia: "../inspinia",
      pace: "../plugins/pace/pace.min",
      chosen: "../plugins/chosen/chosen.jquery",
      icheck: "../plugins/iCheck/icheck.min",
      highcharts: "../highcharts/highcharts",
      highchartsmore: "../highcharts/highcharts-more",
      highchartsexporting: "../highcharts/exporting",
			jquerysteps: "../plugins/jquery.steps/jquery.steps",
			jqueryvalidate: "../plugins/validate/jquery.validate.min",
      // here the custom controllers for this application
      custompageloader: "ebola_loader"
    },
		shim: {
    	highcharts: {
      	exports: "Highcharts",
      	deps: ["jquery"]
			},
			highchartsmore: {
				exports: "Highcharts",
      	deps: ["jquery", "highcharts"]
    	},
			highchartsexporting: {
				exports: "Highcharts",
      	deps: ["jquery", "highcharts"]
    	}
  	}
});
