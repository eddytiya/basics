// Define a class named Student with the following attributes:
// a. name, studentId, grade, address.
// b. Include a method displayInfo() that prints all the student’s details


class Student {
    name:string;
    studentId:number;
    grade:string;
    address:string;

    constructor(name:string,studentid:number,grade:string,address:string){
        this.name=name;
        this.studentId=studentid;
        this.grade=grade;
        this.address=address;
    }

    displayInfo(){
        console.log("the name of the student is "+this.name+" whose studentID is "+this.studentId+" has got the grade:"+this.grade+" and lives at "+this.address);
        
    }

}

const stud=new Student("Aditya",4530,"A","Goregaon");
stud.displayInfo();