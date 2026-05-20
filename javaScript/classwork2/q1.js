// Provide an example of array destructuring and object destructuring in
// JavaScript.


array1=[1,2,3,4]
products=[{name:"keyboard",price:123},{name:"piano",price:2345}]

const[{name:p1},{name:p2}]=products

console.log(p1);

const[a1,a2,a3,a4]=array1

console.log(a2);
console.log(a3);



const object1={
    name:"adi",
    id:1
}

const{name,id}=object1

console.log(name);

