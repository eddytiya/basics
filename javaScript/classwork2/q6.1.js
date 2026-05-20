// Show the uses of try/catch when processing a payment during the checkout process,
// handling possible errors like payment failure or network issues.

function checkout(amount){
try{
    console.log("processing payment....");

    const paymentFailure=Math.random()<0.3;
    const networkIssure=Math.random()<0.3;

    if(paymentFailure){
        throw new Error("payment failute try again")
    }

    if(networkIssure){
        throw new Error("network")
    }


    console.log("payment success",amount);
    
    
}catch(e){
    console.log(e.name+" "+e.message);
    
}

}

checkout(1000)