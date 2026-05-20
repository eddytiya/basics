"use strict";
// Demonstrate an example for Interface
class Bike {
    start() {
        console.log("ignite to start the engine");
    }
    stop() {
        console.log("apply brakes to stop the bike");
    }
}
const bike = new Bike();
bike.start();
bike.stop();
