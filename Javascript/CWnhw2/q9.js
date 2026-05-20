// Create a User Defined exception.


class InvalidAge extends Error{
    constructor(message){
        super(message);
        this.name="InvalidAge";
    }
}

function checkage(age){
    try{
        if(age<18){
            throw new InvalidAge("not able to vote cause under 18")
        }else{
            console.log("able to vote");
            

        }
    }catch(e){
        console.log(e.name+" "+e.message);
        
    }
}

checkage(19)
checkage(17)