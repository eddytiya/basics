// Show an example of a finally block that executes when updating customer profile
// information, regardless of whether the operation was successful or resulted in an
// error.



function customer_profile(boole){
    try{
        if(boole==false){
            throw new Error("truely failure")
        }
    }
    catch(e){
        console.log(e.name+" "+e.message);
        
    }finally{
        console.log("thanks");
        
    }
}


customer_profile(false)