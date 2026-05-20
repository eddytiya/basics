// Show Uses of Try /Catches 


// try{
//     const pi=3.14;
//     pi=22.7;
// }catch(e){
//     console.log(e.name+" "+e.message);   
// }


// Show the uses of try/catch when processing a payment during the checkout process,
// handling possible errors like payment failure or network issues.

function checkout(Amount){
    console.log("processing payment............");


    let payment_failure=Math.random()<0.3;
    let network_issues=Math.random()<0.3;


    try{
        if(payment_failure){
            throw new Error("retry payment failure ........")
        }

        if(network_issues){
            throw new Error("retry payment network issues ........")
        }

        console.log("success",Amount);
        
    }catch(e){
        console.log(e.name+" "+e.message);
        
    }
    
}


checkout(1000)