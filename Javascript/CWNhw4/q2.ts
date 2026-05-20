// Create a class which contains static and non-static members.


class Car{
    
    numberplate:string;
    chassisNumber:number;

    static car_brand:string = "Morris-garages";
    static car_model:string = "hector";


    constructor(numberplate:string,chassisNumber:number){
        this.numberplate=numberplate;
        this.chassisNumber=chassisNumber;
    }

    disp(){
        console.log(this.numberplate);
        console.log(this.chassisNumber);
        
    }

    static car_info(){
        console.log(this.car_brand);
        console.log(this.car_model);
        
    }
}

const car = new Car("MH3856",1234567)
car.disp();

Car.car_info();