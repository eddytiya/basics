// 3
// Implement an anonymous function assigned to the variable increaseMarks that
// takes an array of marks as a parameter and increases each mark by 10.

const arr=[1,2,3,4,5,6,7,8,9]

const increaseMarks=function anonymous(arr){
    return arr.map((d)=>{
        return d+10;
    },0)

    
}

console.log(increaseMarks(arr));



// An anonymous function assigned to the variable multiplyByTwo that
//  Take number as a parameter and multiplies each element by 2.

const multiplyByTwo =function anonymous(arr){
    return arr.map((d)=>{
        return d*2;
    },0)

}

console.log(multiplyByTwo(arr));



const increaseMarksby15=function anonymous(arr){
    return arr.map((C)=>{
        return C+15;
    },0)
}

console.log(increaseMarksby15(arr));
