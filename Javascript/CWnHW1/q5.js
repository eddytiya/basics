// Demonstrate array methods (map, filter, reduce):
// a. Use map to convert marks to grades.
// b. Use filter to extract students who scored above 75.
// c. Use reduce to calculate the total marks of all students.


//a

marks=[10,20,30,40,50,60,70,80,90];

const mkstogrades = marks.map((d)=>{
    if(d>=90){
        return "A";
    }else if(d>=80){
        return "B";
    }else if(d>=70){
        return "C";
    }else if(d>=60){
        return "D";
    }else if(d>=50){
        return "E";
    }else{
        return "F";
    }
},0)

console.log(mkstogrades);

//b

const filtering=marks.filter((e)=>{
    return e>75;
},0)

console.log(filtering);

//c

const totalmks=marks.reduce((s,tot)=>{
    return s+tot;
},0)

console.log(totalmks);






// Demonstrate array method (map, filter, reduce)
// a. Map to square each number.
// b. Filter to extract odd number.
// c. Reduce to calculate the sum of all elements.


arr=[1,2,3,4,5,6,7,8,9];
//a
const square= arr.map((a)=>{
    return a**2;
},0)

console.log(square);

const oddnumber=arr.filter((b)=>{
    return b%2==1;
},0)

console.log(oddnumber);

const totalsum=arr.reduce((Sum,total)=>{
    return Sum+total;
},0)

console.log(totalsum);



