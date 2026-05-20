// Write a named function filterEvenNumbers that takes an array of numbers as a
// parameter and returns a new array containing only the even numbers.

arr=[1,2,3,4,5,6,7,8,9]



function filter(){
const filterEvenNumbers=arr.filter((c)=>{
    return c%2==0
},0)

console.log(filterEvenNumbers);
}


filter(arr)
