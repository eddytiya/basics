// Show an example of exception propagation when adding an item to a shopping cart
// if the product is out of stock in the online store's inventory.



function stock(stockqty){
    if(stockqty<=1){
        throw new Error("low stock quantity")
    }else{
        console.log("instock");
        
    }

}


function checkStock(stockqty){
    stock(stockqty)
}

function add_toCart(stockqty){
    try{
        checkStock(stockqty);
    }catch(e){
        console.log(e.name+" "+e.message);
        
        
    }
}

add_toCart(1);
add_toCart(10);