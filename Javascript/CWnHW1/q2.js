// an arrow function named square that takes a number as a parameter
//  and returns the square

const square=number=>number**2

console.log(square(5));



// 2
// Create an arrow function named calculateGrade that takes a score as a parameter
// and returns the grade (e.g., A, B, C).

const calculateGrade =score=>{
    if(score>90){
        return "S";
        
    }else if(score>80){
        return "A";       
    }else if(score >70){
        return "B";
        
    }else if(score >60){
        return "C";
    }
    else if(score >50){
        return "D";
    }else{
       return "F";
        
    }
}


console.log(calculateGrade(91));
