// Show an example of throw where a function throws an exception if a product's
// quantity in the inventory falls below a certain threshold (e.g., less than 5 units)



function product(quantity){
    if (quantity<5){
        try{
        throw new Error("low stock")
    }catch(e){
        console.log(e.name+"-"+e.message);
        
        }
    }else{
        console.log("instock");
        
    }
}

product(4)
product(10)