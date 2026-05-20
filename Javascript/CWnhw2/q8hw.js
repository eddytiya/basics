// Show an example of a finally block that executes when updating customer profile
// information, regardless of whether the operation was successful or resulted in an
// error

function customer_profile(boole){
    try{
        if(boole==false){
            throw new Error("error thrown successfully incomplete profile")
        }else{
            console.log("profile is complete");
            
        }
}catch(e){
    console.log(e.name+" "+e.message);
    
}
finally{
    console.log("thankyou for visiting us");
    
}
}

customer_profile(true);
customer_profile(false);