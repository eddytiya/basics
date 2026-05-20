// Define a class named Student with the following attributes:
// a. name, studentId, grade, address.
// b. Include a method displayInfo() that prints all the student’s details.
var student = /** @class */ (function () {
    function student(name, studentID, grade, Address) {
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
        this.Address = Address;
    }
    student.prototype.display = function () {
        console.log(this.name + " " + this.studentID + " " + this.grade + " " + this.Address);
    };
    student.dispStatic = function () {
        console.log(this.school_name);
        console.log(this.schoolNUmber);
    };
    student.school_name = "sjpa";
    student.schoolNUmber = 123456789;
    return student;
}());
var s = new student("aditya", 123, "A", 123);
s.display();
student.dispStatic();
