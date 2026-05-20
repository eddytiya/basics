// Create a class School that contains:
// a. Static member: totalStudents to track the total number of students.
// b. Non-static member: studentList to store individual student details.
// c. Methods to increment the static member and add student details to the nonstatic list.


class School{
    studentname:string;
    studentrollno:number;

    static number_of_girls:number=40;
    static number_of_boys:number=50;
    
    constructor(studentname:string,studentrollno:number){
        this.studentname=studentname;
        this.studentrollno=studentrollno;
    }

    static total_students(){
        console.log(this.number_of_boys+this.number_of_girls);
        
    }

    studentList(){
        console.log(this.studentname);
        console.log(this.studentrollno);
        
        
    }
}

const schl = new School("aditya",123);

schl.studentList();
School.total_students();