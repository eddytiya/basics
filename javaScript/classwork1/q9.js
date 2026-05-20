// Write a program to find the total sales from an array of Order objects in an e-
// commerce system.

const system=[
    {name:"keyboard",price:1234},
    {name:"mouse",price:2234},
    {name:"desktop",price:3234},
    {name:"pliers",price:4234},
]

const totalsales=system.reduce((tot,s)=>{
    return tot+s.price
},0)

console.log(totalsales);
