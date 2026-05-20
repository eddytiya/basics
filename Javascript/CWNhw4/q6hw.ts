// Create a generic function getStudentInfo<T>(info: T): T that returns any type of
// student information, such as name, ID, or grade.


function getStudentInfo<T>(info:T):T{
    return info;
}

console.log(getStudentInfo<string>("aditya"));
console.log(getStudentInfo<number>(123));
console.log(getStudentInfo<string>("A"));
