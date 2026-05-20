// Demonstrate array method (map, filter, reduce)
// a. Map to square each number.
// b. Filter to extract odd number.
// c. Reduce to calculate the sum of all elements.


arr=[1,2,3,4,5,6,7,8,9,10]

const mapping=arr.map((a)=>{
    return a**2
},0)

console.log(mapping);

const filteringodd=arr.filter((v)=>{
    return v%2==1;
},0)

console.log(filteringodd);


const totalarr=arr.reduce((tot,s)=>{
    return tot+s
},0)

console.log(totalarr);


