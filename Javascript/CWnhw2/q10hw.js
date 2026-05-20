// Show an example of throw where a function throws an exception if a product's
// quantity in the inventory falls below a certain threshold (e.g., less than 5 units)



function inventory(quantity){
    try{
    if(quantity<=5){
        throw new Error("quantity is less than 5")
    }

    else{
        console.log("in stock");
        
    }

    }catch(e){
        console.log(e.name+" "+e.message);
        
    }
}

inventory(7);
inventory(3);


//acc to que

function inventory(quantity){
    if(quantity <= 5){
        throw new Error("Quantity is less than 5");
    } else {
        console.log("In stock");
    }
}

try{
    inventory(7);
    inventory(3);
}catch(e){
    console.log(e.name + " " + e.message);
}