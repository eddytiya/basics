"use strict";
// Create a class School that contains:
// a. Static member: totalStudents to track the total number of students.
// b. Non-static member: studentList to store individual student details.
// c. Methods to increment the static member and add student details to the nonstatic list.
class School {
    studentname;
    studentrollno;
    static number_of_girls = 40;
    static number_of_boys = 50;
    constructor(studentname, studentrollno) {
        this.studentname = studentname;
        this.studentrollno = studentrollno;
    }
    static total_students() {
        console.log(this.number_of_boys + this.number_of_girls);
    }
    studentList() {
        console.log(this.studentname);
        console.log(this.studentrollno);
    }
}
const schl = new School("aditya", 123);
schl.studentList();
School.total_students();
