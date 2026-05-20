"use strict";
// Create class Emp with its important attributes like
// a. Name/id/salary/address
// b. Method – display Info
class Emp123 {
    name = "aditya";
    id = 123;
    salary = 20000;
    address = "Goregaon";
    display_info() {
        console.log(this.name);
        console.log(this.id);
        console.log(this.salary);
        console.log(this.address);
    }
}
const emp123 = new Emp123();
emp123.display_info();
