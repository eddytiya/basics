var bike = /** @class */ (function () {
    function bike() {
    }
    bike.prototype.start1 = function () {
        console.log("ignite");
    };
    bike.prototype.stop1 = function () {
        console.log("stopp");
    };
    return bike;
}());
var b = new bike();
b.start1();
b.stop1();
