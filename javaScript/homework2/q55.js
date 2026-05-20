// Demonstrate an example for default parameters and rest parameters in a function
// that calculates the total cost of items in a customer's shopping cart. Use a default
// parameter for applying a discount rate and rest parameters for the list of product
// prices.



function checkout(discount_factor=10,...prices){
    const total_amount1=prices.reduce((tot,prices)=>{
        return tot+prices
    },0)

    const discount=(total_amount1*discount_factor)/100

    const final=total_amount1-discount

    return final;
}


console.log(checkout(10,1000,2000,3000));

