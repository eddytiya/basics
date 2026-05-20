// Show the uses of try/catch when processing a payment during the checkout process,
// handling possible errors like payment failure or network issues.



function payment(amount){
    try{

    
    console.log("processing payment.....");

    let paymentFAILURE=Math.random()<0.3
    let networkFAILURE=Math.random()<0.3

    if(paymentFAILURE){
        throw new Error("payment failure....... try again")
    }
    if(networkFAILURE){
        throw new Error("network error....try again")
    }

    console.log("success",amount);
    
    }
    catch(e){
        console.log(e.name+" "+e.message);
        
    }
}


payment(1000)