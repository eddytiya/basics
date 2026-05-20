"use strict";
// Define an abstract class Person with abstract methods getDetails() and getRole().
// Create two derived classes Student and Teacher that implement these methods to
// return their respective details and roles.
class Person {
}
class Teacher extends Person {
    getRole() {
        console.log("teacher");
    }
    getDetails() {
        console.log("teaching");
    }
}
class Studentss extends Person {
    getDetails() {
        console.log("student");
    }
    getRole() {
        console.log("study");
    }
}
const teacher = new Teacher();
const student = new Studentss();
teacher.getDetails();
teacher.getRole();
student.getDetails();
student.getRole();
