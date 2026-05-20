// Define an abstract class Institute with an abstract method getInstitutionType().
// Create a class School implementing the interface Management with methods like
// addStudent(), removeStudent().
// Combine these in a real-time use case to manage different types of institutions like
// School and College.

abstract class Institute{
    abstract getInstituteType():void;
}

interface Management{
addStudent():void;
removeStudent():void;
}

class school implements Management{
    addStudent(): void {
        console.log("add student to school");
        
    }
removeStudent(): void {
    console.log("remove this child from school");
    
}
}

class College extends Institute{
    getInstituteType(): void {
        console.log("good thebad the ugly")
    }
}

const s1 = new school();
s1.addStudent()
s1.removeStudent()

const c1= new College();

c1.getInstituteType()