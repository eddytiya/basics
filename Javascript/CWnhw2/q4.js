// Demonstrate an example of Async and await.


function payment(status){
    return new Promise((resolve,reject)=>{
        if(status){
            resolve("payment success");
        }else{
            reject("payment failed")
        }
    })
}

// payment(false)

// .then((result)=>{
//     console.log(result);
    
// })

// .catch((error)=>{
//     console.log(error);
    
// })

async function test() {
    try{
        const a = await payment(false);
        if(a){
            console.log(a);
            
        }
    }catch(e){
        console.log(e);
        
    }
    
}

test();




