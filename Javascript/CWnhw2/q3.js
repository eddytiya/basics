// Demonstrate an example for Promise.


function payment(status){
    return new Promise((resolve,reject)=>{
        if(status){
            resolve("payment success");
        }else{
            reject("payment failed");
        }
    })
}

payment(true)
.then((result)=>{
    console.log(result);
    
})

.catch((error)=>{
    console.log(error);
    
})



console.log("------------------------------------------------------------------------");

// Demonstrate an example of a Promise that simulates fetching product details (e.g.,
// name, price, availability) from an online store's server

function fetch_products(status){
    return new Promise((resolve,reject)=>{
        if (status){
            resolve([
                {productname:"biscuits",price:30},
                {productname:"wafers",price:20},
                {productname:"chocolates",price:10},
            ])
        }else{
            reject("no products found");
        }
    })
}


fetch_products(true)
.then((result)=>{
    console.log(result);
    
})

.catch((error)=>{
    console.log(error);
    
})