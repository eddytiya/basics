// Define an abstract class Person with abstract methods getDetails() and getRole().
// Create two derived classes Student and Teacher that implement these methods to
// return their respective details and roles.


abstract class Person{
    abstract getDetails():void;
    abstract getRole():void;

}

class Teacher extends Person{
    getRole(): void {
        console.log("teacher");
             
    }

    getDetails(): void {
        console.log("teaching");
        
        
    }
}

class Studentss extends Person{
    getDetails(): void {
        console.log("student");
        
    }
    getRole(): void {
        console.log("study");
                
    }
    
}


const teacher = new Teacher();
const student = new Studentss();

teacher.getDetails();
teacher.getRole();

student.getDetails();
student.getRole();