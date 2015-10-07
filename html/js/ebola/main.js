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
			$("#wizard").steps({
			  onStepChanging: function (event, currentIndex, newIndex) {
					if (currentIndex == 0) {
						// after login
						document.getElementById("log-in-collapse").click();
						document.getElementById("submit-form-collapse").click();
					} else if (currentIndex == 1 | newIndex == 2) {
						cleanup_data_form();
						document.getElementById('ith1').value = 4;
						document.getElementById('num1').value = 281;
						document.getElementById('ith2').value = 11;
						document.getElementById('num2').value = 707;

						var chart = chart_controller.getChartInstance();
						if (is_chart_collapsed()) {
								chart_collapse.click();
						}
						chart.ranges = get_default_ranges();
						chart.averages = get_default_averages();
						chart.scatter_data = [];
						chart_view_update();
						document.getElementById("chart").focus()
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

			document.getElementById("submit-form-collapse").click();
			document.getElementById("get-real-form-collapse").click();

			var chart_collapse = document.getElementById("chart-collapse");
			chart_collapse.click();

			// function to detect is element is collapsed
			var is_chart_collapsed = function() {
				var button_chart_collapse = $(chart_collapse).find("i");
				var classList = button_chart_collapse.attr("class").split(/\s+/);
				var arrayLength = classList.length;
				for (var i=0; i < arrayLength; i++) {
					if (classList[i] == "fa-chevron-up") {
						return false;
					}
					if (classList[i] == "fa-chevron-down") {
						return true;
					}
				}
			};

			// functions that manage the view of the chart
			get_default_ranges = function() {
				return [
						[1246406400000, 14.3, 27.7],
						[1246492800000, 14.5, 27.8],
						[1246579200000, 15.5, 29.6],
						[1246665600000, 16.7, 30.7],
						[1246752000000, 16.5, 25.0],
						[1246838400000, 17.8, 25.7],
						[1246924800000, 13.5, 24.8],
						[1247011200000, 10.5, 21.4],
						[1247097600000, 9.2, 23.8],
						[1247184000000, 11.6, 21.8],
						[1247270400000, 10.7, 23.7],
						[1247356800000, 11.0, 23.3],
						[1247443200000, 11.6, 23.7],
						[1247529600000, 11.8, 20.7],
						[1247616000000, 12.6, 22.4],
						[1247702400000, 13.6, 19.6],
						[1247788800000, 11.4, 22.6],
						[1247875200000, 13.2, 25.0],
						[1247961600000, 14.2, 21.6],
						[1248048000000, 13.1, 17.1],
						[1248134400000, 12.2, 15.5],
						[1248220800000, 12.0, 20.8],
						[1248307200000, 12.0, 17.1],
						[1248393600000, 12.7, 18.3],
						[1248480000000, 12.4, 19.4],
						[1248566400000, 12.6, 19.9],
						[1248652800000, 11.9, 20.2],
						[1248739200000, 11.0, 19.3],
						[1248825600000, 10.8, 17.8],
						[1248912000000, 11.8, 18.5],
						[1248998400000, 10.8, 16.1]
				]
			};

			get_default_averages = function () {
				return [
						[1246406400000, 21.5],
						[1246492800000, 22.1],
						[1246579200000, 23],
						[1246665600000, 23.8],
						[1246752000000, 21.4],
						[1246838400000, 21.3],
						[1246924800000, 18.3],
						[1247011200000, 15.4],
						[1247097600000, 16.4],
						[1247184000000, 17.7],
						[1247270400000, 17.5],
						[1247356800000, 17.6],
						[1247443200000, 17.7],
						[1247529600000, 16.8],
						[1247616000000, 17.7],
						[1247702400000, 16.3],
						[1247788800000, 17.8],
						[1247875200000, 18.1],
						[1247961600000, 17.2],
						[1248048000000, 14.4],
						[1248134400000, 13.7],
						[1248220800000, 15.7],
						[1248307200000, 14.6],
						[1248393600000, 15.3],
						[1248480000000, 15.3],
						[1248566400000, 15.8],
						[1248652800000, 15.2],
						[1248739200000, 14.8],
						[1248825600000, 14.4],
						[1248912000000, 15],
						[1248998400000, 13.6]
				]
			};

			get_default_scatter_data = function() {
				return [
					[1, 7.0],
					[2, 6.9],
					[4, 14.5],
					[7, 25.2]
				]
			};

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


			// load empty chart so that it gets size
			chart_view_update();

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
					//success: function(data, textStatus, jqXHR) {
					//	var chart = ChartSingleton.getInstance();
					//	if (data.iths) {
					//		if (is_chart_collapsed()) {
					//			chart_collapse.click();
					//			chart_is_collapsed = false;
					//		}
					//		chart.set_scatter_data_real(data);
					//		chart.update();
					//		document.getElementById("get-real-form-collapse").click();
					//		document.getElementById("chart").focus()
					//	} else {
					//		console.log("Error in response from server. No data.iths")
					//	}
					//}
			});

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
			jquerysteps: "../plugins/staps/jquery.steps.min",
			jqueryvalidate: "../plugins/validate/jquery.validate.min",
      // here the custom controllers for this application
      custompageloader: "ebola_loader"
    }
});
