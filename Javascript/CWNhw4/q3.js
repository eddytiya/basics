"use strict";
// Show an example for parameterized constructor.
// Create a Course class with a parameterized constructor that takes courseName,
// courseCode, and instructor as parameters and assigns them to class attributes.
class Course {
    coursename;
    coursecode;
    instructor;
    constructor(coursename, coursecode, instructor) {
        this.coursename = coursename;
        this.coursecode = coursecode;
        this.instructor = instructor;
    }
    display_info() {
        console.log(this.coursecode);
        console.log(this.coursename);
        console.log(this.instructor);
    }
}
const c = new Course("cs", 123, "aditya");
c.display_info();
