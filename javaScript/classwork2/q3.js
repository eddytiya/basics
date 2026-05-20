// Demonstrate an example for Promise.

function payment(status){
    return new Promise((resolve,reject)=>{
        if(status){
            resolve("payment successful")
        }
        else{
            reject("payment unsuccessful")
        }
    })
}

payment(false)
.then((result)=>{
    console.log(result);
    
})
.catch((error)=>{
    console.log(error);
    
})