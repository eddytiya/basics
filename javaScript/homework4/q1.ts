// Define a class named Student with the following attributes:
// a. name, studentId, grade, address.
// b. Include a method displayInfo() that prints all the student’s details.


class student{
    name:string;
    studentID:number;
    grade:string;
    Address:number;

    static school_name:string="sjpa";
    static schoolNUmber:number=123456789;


    constructor(name:string,studentID:number,grade:string,Address:number){
        this.name=name;
        this.studentID=studentID;
        this.grade=grade;
        this.Address=Address;
    }

    display(){
        console.log(this.name+" "+this.studentID+" "+this.grade+" "+this.Address);
        
    }
    static dispStatic(){
        console.log(this.school_name);
        console.log(this.schoolNUmber);
        
    }
}


const s = new student("aditya",123,"A",123);
s.display();
student.dispStatic()