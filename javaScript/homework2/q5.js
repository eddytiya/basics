// Demonstrate an example for default parameters and rest parameters in a function
// that calculates the total cost of items in a customer's shopping cart. Use a default
// parameter for applying a discount rate and rest parameters for the list of product
// prices.


function total_amount(discount_factor=10,...prices){
    const total=prices.reduce((tot,price)=>{
        return tot+price
    },0)

    const discount1=(total*discount_factor)/100
    const final=total-discount1
    return final
}



console.log(total_amount(10,1000,2000,3000));
  total_amount(10,1000,2000,3000)