// Create a Function findMax That Accepts an Array of Numbers and Returns the Largest
// Number in the Array.

arr=[1,2,3,4,5,6,7,8,9];

function findMax(arr){
    return Math.max(...arr);

}

console.log(findMax(arr));


console.log("---------------------------------------------------------------------------------");

// Create a function findTopper that accepts an array of student marks and returns
// the highest mark.

marks=[10,20,30,40,50,60,70,80,90];

function findTopper(marks){
    return Math.max(...marks);
}


console.log(findTopper(marks));
