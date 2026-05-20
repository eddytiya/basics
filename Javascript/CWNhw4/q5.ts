// Demonstrate an example for Interface

interface Vehicle{
    start():void;
    stop():void;
}

class Bike implements Vehicle{

    start(): void {
        console.log("ignite to start the engine");
        
    }

    stop(): void {

        console.log("apply brakes to stop the bike");
        
        
    }
}

const bike = new Bike();

bike.start();
bike.stop();