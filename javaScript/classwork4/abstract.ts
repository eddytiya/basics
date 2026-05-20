abstract class vehicle{
    abstract start():void;
    abstract stop():void;
}

class Car extends vehicle{
    start(): void {
        console.log("ignite the engine");
        
    }
    stop(): void {
        console.log("press brakes to stop the car");
             
    }
}

const car= new Car();
car.start();
car.stop();