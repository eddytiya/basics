interface vehicle1{
    start1():void;
    stop1():void;
}

class bike implements vehicle1{
    start1(): void {
        console.log("ignite");
        
    }

    stop1(): void {
        console.log("stopp");
        
    }
}

const b = new bike();
b.start1()
b.stop1()
