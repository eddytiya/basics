// Demonstrate an example of async and await to simulate fetching and displaying a
// customer's order history from an online shopping system.


function orderHistory(status){
    return new Promise((resolve,reject)=>{
        if(status){
            resolve([
                {productname:"biscuits",price:30},
                {productname:"wafers",price:20},
                {productname:"chocolates",price:10},
            ])
        }else{
            reject("no products found")
        }
    })
}

// orderHistory(true)
// .then((resukt)=>{
//     console.log(resukt);
    
// })

// .catch((e)=>{
//     console.log(e);
    
// })


async function test() {
    try{
        const a= await orderHistory(false);
        if(a){
            console.log(a);
            
        }
    }catch(e){
        console.log(e);
        
    }
    
}

test();