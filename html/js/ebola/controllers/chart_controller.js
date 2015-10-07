define("controllers/chart_controller",

        ["jquery"],

        function ($) {

          // chart manager as a singleton
          var ChartSingleton = (function () {

            var instance;

            function init() {

              return {
                // public methods and variables
                ranges: null,
                averages: null,
                scatter_data: null,
                scatter_data_real: null,
                update: function () {
                  chart_update();
                },
                set_ranges: function(ranges) {
                  this.ranges = [];
                  var arrayLength = ranges.length;
                  for (var i=0; i < arrayLength; i++) {
                    this.ranges.push(ranges[i].items);
                  }
                },
                set_averages: function(averages) {
                  this.averages = [];
                  var arrayLength = averages.length;
                  for (var i=0; i < arrayLength; i++) {
                    this.averages.push(averages[i].items);
                  }
                },
                set_scatter_data: function(data) {
                  this.scatter_data = [];
                  var arrayLength = data.iths.length;
                  for (var i=0; i < arrayLength; i++) {
                    if (data.iths[i] == "") {
                      break;
                    }
                    item = new Array(parseInt(data.iths[i]), parseInt(data.nums[i]));
                    this.scatter_data.push(item)
                  }
                },
                set_scatter_data_real: function(data) {
                  this.scatter_data_real = [];
                  var arrayLength = data.iths.length;
                  for (var i=0; i < arrayLength; i++) {
                    if (data.iths[i] == "") {
                      break;
                    }
                    item = new Array(parseInt(data.iths[i]), parseInt(data.nums[i]));
                    this.scatter_data_real.push(item)
                  }
                }
              };

            };

            return {

              getInstance: function () {
                if ( !instance ) {
                  instance = init();
                }
                return instance;
              }

            };
          })();


          return {
            getChartInstance : function() {
              return ChartSingleton.getInstance();
            }
          }

        }
)
