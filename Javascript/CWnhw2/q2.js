// Create a class named Emp with following attribute name, id, salary &
// displayInfo method provide access code for the same.


class Emp{
    name;
    id;
    sal;

    constructor (name,id,sal){
        this.name=name;
        this.id=id;
        this.sal=sal;
    }

    displayInfo(){
        console.log(this.name);
        console.log(this.id);
        console.log(this.sal);     
    }
}


const emp = new Emp("Aditya",4530,50000);

emp.displayInfo();



console.log("--------------------------------------------------------------------------------------");


// Create a class named Product with the following attributes: name, productId, price,
// and a displayDetails method. Provide code to access and display these details for a
// product.


class Product{
    name;
    productId;
    price;

    constructor(name,productId,price){
        this.name=name;
        this.productId=productId;
        this.price=price;
    }

    displayDetails(){
        console.log("the name of the product is "+this.name+" and the product id is "+this.productId+" has the price of "+this.price);
        
    }
}

const a = new Product("trimmer",123,"1800");

a.displayDetails();
