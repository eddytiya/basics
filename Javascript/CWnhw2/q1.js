// provide an example of array destructuring and object destructuring in
//  JavaScript.


//array destructuring

const arr=[1,2,3,4,5];
const[a1,a2,a3]=arr

console.log(a1);
console.log(a3)

//object destructuring;

const emp={
    name:"umesh",
    sal:20000
}

const{name,sal}=emp;

console.log(name);
console.log(sal);

console.log("---------------------------------------------------------------------------------");

// Provide an example of array destructuring and object destructuring in JavaScript to
// extract product names from an array of products and their details from a product
// object in an online shopping system.


const orders =["laptop","mobile","tv"]
const[p1,p2,p3]=orders;
console.log(p1);

const product={
productname:"mobile",
brand:"apple",
price:80000
}

const{productname,brand,price}=product

console.log(brand);

console.log(productname);




//(extra)
const product123=[
    {name:"pen",price:10},
    {name:"pencil",price:5},
    {name:"sketchpen",price:20},
]

const[{name:n1},{name:n2},{name:n3}]=product123

console.log(n2);

