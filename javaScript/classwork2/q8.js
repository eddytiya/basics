// Show an example of a finally block that executes when updating customer profile
// information, regardless of whether the operation was successful or resulted in an
// error.

function customer_profile(boole){

try{
    if(boole==false){
        throw new Error("profile not completed")
    }else{
        console.log("competed ");
        
    }
}catch(e){
    console.log(e.name+" "+e.message);    
}
finally{
    console.log("this message will execute");
    
}
}

customer_profile(false)