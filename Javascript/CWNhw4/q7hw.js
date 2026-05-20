"use strict";
// Define an abstract class Institute with an abstract method getInstitutionType().
// Create a class School implementing the interface Management with methods like
// addStudent(), removeStudent().
// Combine these in a real-time use case to manage different types of institutions like
// School and College.
class Institute {
}
class School1 extends Institute {
    getInstituteType() {
        console.log("ICSE");
    }
    addStudent() {
        console.log("add students on basis of merits");
    }
    removeStudent() {
        console.log("remove students on basis of behaviour");
    }
}
class College1 extends Institute {
    getInstituteType() {
        console.log("HSC");
    }
    addStudent() {
        console.log("add students on basis of merits");
    }
    removeStudent() {
        console.log("remove students on basis of behaviour");
    }
}
const schl1 = new School1();
schl1.getInstituteType();
schl1.addStudent();
schl1.removeStudent();
const college1 = new College1();
college1.getInstituteType();
college1.addStudent();
college1.removeStudent();
