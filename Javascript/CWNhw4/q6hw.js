"use strict";
// Create a generic function getStudentInfo<T>(info: T): T that returns any type of
// student information, such as name, ID, or grade.
function getStudentInfo(info) {
    return info;
}
console.log(getStudentInfo("aditya"));
console.log(getStudentInfo(123));
console.log(getStudentInfo("A"));
