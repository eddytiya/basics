function payment(status){
    return new Promise((resolve,reject)=>{
        if(status){
            resolve("successful")
        }
        else{
            reject("unsuccessful")
        }
    })
}

async function test() {
    try{
        const a = await payment();
        if(a){
            console.log(a);
            
        }
    }catch(e){
        console.log(e);
        
    }
    
}

test()