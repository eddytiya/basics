// Demonstrate an example of a Promise that simulates fetching product details (e.g.,
// name, price, availability) from an online store's server.


function product(status){
    return new Promise((resolve,reject)=>{
        if(status){
            resolve("success")
        }
        else{
            reject("rejected")
        }
    })
}

// product(true)
// .then((result)=>{
//     console.log(result);
    
// })
// .catch((error)=>{
//     console.log(error);
    
// })


async function test(){
    try{
        const a = await product();
        if(a){
            console.log(a);
            
        }
    }catch(e){
        console.log(e);
        
    }
}

test()