// Create an interface Attendance with a method markAttendance().
// Implement this interface in the Student class, and define how attendance is marked
// for a student.


interface Attendance{
    markAttendance():void;

}

class Student1 implements Attendance{

    markAttendance(): void {
        console.log("to mark your attendance log in to the app and click a selfie of urs");
        
    }

}

const stu = new Student1();
stu.markAttendance();