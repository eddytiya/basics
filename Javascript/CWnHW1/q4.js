// Write a named function filterEvenNumbers that takes an array of numbers as a
//  parameter and returns a new array containing only the even number


const arr=[1,2,3,4,5,6,7,8,9]
function filterEvenNumbers(arr){

    return arr.filter((a)=>{
        return a%2==0;
    },0)

    

}

console.log(filterEvenNumbers(arr));



// Write a named function filterPassedStudents that takes an array of student marks
// and returns a new array containing only the students who passed.







const marks=[10,20,30,40,50,60,70,80];

function filterPassedStudents (marks){
    return marks.filter((d)=>{
        return d>50;
    },0)
}

console.log("the marks of passed students are:"+filterPassedStudents(marks));





///this is just a trial of arrow func
const filterPassedStudents1=arr.filter((c)=>{
    return c>5;
},0)

console.log(filterPassedStudents1);

