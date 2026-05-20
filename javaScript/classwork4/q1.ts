// Create class Emp with its important attributes like
// a. Name/id/salary/address
// b. Method – display Info


// Create a class which contains static and non-static members.

// Show an example for parameterized constructor.


class Emp{
    name:string;
    id:number;
    salary:number;
    address:string;

    static c_name:string="adifii";
    static c_number:number=9877;


    constructor(name:string,id:number,salary:number,address:string){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.address=address;
    }

    displayInfo(){
        console.log(this.name+" "+this.id+" "+this.salary+" "+this.address);
        
    }

    static displaystatic(){
        console.log(this.c_name+" "+this.c_number);
        
    }
}


const emp = new Emp("aditya",123,123456789,"goregaon");
emp.displayInfo();
Emp.displaystatic();