// Write a program to find the total sales from an array of Order objects in an ecommerce system.

const orders=[
    {product:"laptop", sal:150000},
    {product:"mobile",sal:80000}
];

const totSales=orders.reduce((d,tot)=>{
    return d+tot.sal;
},0)

console.log(totSales);


// Write a program to find the total marks scored by all students in a class.

const students=[
    {name:"aditya",marks:90},
    {name:"raj",marks:80},
    {name:"baigan",marks:70},
    {name:"kashi",marks:60},
]


const totalmarks=students.reduce((s,tot1)=>{
    return s+tot1.marks;
},0)

console.log(totalmarks);

