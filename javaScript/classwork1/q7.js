// Write a Function to Filter Employees Earning More Than a Certain Amount from an
// Array of Employee Objects.


const Employee=[
    {name:"messi",salary:98000},
    {name:"ronaldo",salary:88000},
    {name:"neymar",salary:78000}
]

console.log(Employee);

const filteremployees=Employee.filter((emp)=>{
    return emp.salary>=88000
})


console.log(filteremployees);
