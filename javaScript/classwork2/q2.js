// Create a class named Emp with following attribute name, id, salary &
// displayInfo method provide access code for the same.

class Empl{
    name;
    id;
    salary;


    constructor(name,id,salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    display(){
        console.log(this.name+" "+this.id+" "+this.salary);
        
    }
}

const a=new Empl("aditya",1,123456789)

a.display()