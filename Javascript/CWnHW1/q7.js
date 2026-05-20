// Write a Function to Filter Employees Earning More Than a Certain Amount from an
// Array of Employee Objects.


const Employee=[
    {name:"aditya", sal:50000},
    {name:"pratham",sal:40000}
];

console.log(Employee);

function filteremplpyees(Employee){
const salfilter=Employee.filter((D)=>{
    return D.sal>45000;
},0)
return salfilter;
}
console.log(filteremplpyees(Employee));




// Write a function to filter students with marks greater than 80 from an array of
// student objects.

const students=[
    {name:"aditya",marks:90},
    {name:"raj",marks:80},
    {name:"baigan",marks:70},
    {name:"kashi",marks:60},
]

function marksfilter(students){
    return students.filter((c)=>{
        return c.marks>=80;
    },0)
}

console.log(marksfilter(students));
