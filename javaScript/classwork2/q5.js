// Demonstrate an example for default parameter and rest parameter.


function total_price(discount_factor=10,...prices){
    const total=prices.reduce((total1,prices)=>{
        return total1+prices
    },0)

    const discount=(total*discount_factor)/100
    const finalPricing=total-discount

    return finalPricing
}

console.log( total_price(10,1000,2000,3000));
