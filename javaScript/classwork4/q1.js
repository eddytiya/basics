// Create class Emp with its important attributes like
// a. Name/id/salary/address
// b. Method – display Info
var Emp = /** @class */ (function () {
    function Emp(name, id, salary, address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = address;
    }
    Emp.prototype.displayInfo = function () {
        console.log(this.name + " " + this.id + " " + this.salary + " " + this.address);
    };
    Emp.displaystatic = function () {
        console.log(this.c_name + " " + this.c_number);
    };
    Emp.c_name = "adifii";
    Emp.c_number = 9877;
    return Emp;
}());
var emp = new Emp("aditya", 123, 123456789, "goregaon");
emp.displayInfo();
Emp.displaystatic();
