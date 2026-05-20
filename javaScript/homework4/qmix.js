// Define an abstract class Institute with an abstract method getInstitutionType().
// Create a class School implementing the interface Management with methods like
// addStudent(), removeStudent().
// Combine these in a real-time use case to manage different types of institutions like
// School and College.
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Institute = /** @class */ (function () {
    function Institute() {
    }
    return Institute;
}());
var school = /** @class */ (function () {
    function school() {
    }
    school.prototype.addStudent = function () {
        console.log("add student to school");
    };
    school.prototype.removeStudent = function () {
        console.log("remove this child from school");
    };
    return school;
}());
var College = /** @class */ (function (_super) {
    __extends(College, _super);
    function College() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    College.prototype.getInstituteType = function () {
        console.log("good thebad the ugly");
    };
    return College;
}(Institute));
var s1 = new school();
s1.addStudent();
s1.removeStudent();
var c1 = new College();
c1.getInstituteType();
