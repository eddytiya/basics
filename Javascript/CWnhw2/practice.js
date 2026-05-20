function inventory(qty){
    if(qty<5){
        throw new Error("error hai")
    }else{
        console.log("proper");
        
    }
}


try{
    
inventory(7);
    inventory(3);
    
}catch(e){
    console.log(e.name+" "+e.message);
    
}