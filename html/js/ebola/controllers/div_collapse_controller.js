define("controllers/div_collapse_controller",

        ["jquery"],

        function ($) {

          var DivCollapseController = function() {};
          DivCollapseController.prototype.init = function(pid) {
            this.div_id = pid;
            this.el = document.getElementById(this.div_id);
            this.button = $(this.el).find("i");
          }
          DivCollapseController.prototype._is_collapsed = function(data) {
            var classList = this.button.attr("class").split(/\s+/);
            var arrayLength = classList.length;
            for (var i=0; i < arrayLength; i++) {
              if (classList[i] == "fa-chevron-up") {
                return false;
              }
              if (classList[i] == "fa-chevron-down") {
                return true;
              }
            }
          }
          DivCollapseController.prototype.collapse = function(data) {
            if (this._is_collapsed()) {
              return;
            }
            this.toggle();
            return;
          }
          DivCollapseController.prototype.uncollapse = function() {
            if (this._is_collapsed()) {
              this.toggle();
            }
            return;
          }
          DivCollapseController.prototype.toggle = function() {
            this.button.click();
            return;
          }

          // constructor for factory
          var DivCollapseControllerBuilder = function() {
          };
          DivCollapseControllerBuilder.prototype.build = function() {
            var controller = new DivCollapseController();
            return controller;
          };

          return {
            getBuilder : function() {
              return new DivCollapseControllerBuilder();
            }
          }

        }
)
