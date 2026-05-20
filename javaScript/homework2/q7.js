// Show an example of exception propagation when adding an item to a shopping cart
// if the product is out of stock in the online store's inventory.


function product(quantity){
    if(quantity<=0){
        throw new Error("quantity out of stock")
    }
    else{
        console.log("in stock");
        
    }
}

function add_to_cart(qty){
    product(qty)
}

function checkout(qty){
    try{
        add_to_cart(qty)
    }catch(e){
        console.log(e.name+"-"+e.message);
        
    }
}


checkout(1)
checkout(0)