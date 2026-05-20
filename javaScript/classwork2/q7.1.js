// Show an example of exception propagation when adding an item to a shopping cart
// if the product is out of stock in the online store's inventory.


function item(quantity){
    if(quantity<5){
        throw new Error("out of stock")
    }
    else{
        console.log("in stock");
        
    }
}

function add_to_cart(qty){
    item(qty)
}

function checkStock(qty){
    try{
        add_to_cart(qty)
    }catch(E){
        console.log(E.name+" "+E.message);
        
    }
}

checkStock(3)