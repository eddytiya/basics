// Demonstrate an example for default parameter and rest parameter

function final_payment(discount_factor=10,...prices){

    const total=prices.reduce((sal,tot)=>{
        return sal+tot;
    },0)

    const semifinalprice=(total*discount_factor)/100;
    const final_price=total-semifinalprice;

    return final_price;
}

console.log(final_payment(10,100,100,100));


// Demonstrate an example for default parameters and rest parameters in a function
// that calculates the total cost of items in a customer's shopping cart. Use a default
// parameter for applying a discount rate and rest parameters for the list of product
// prices.


function total_cost(discount_rate=20,...prices){
    const total=prices.reduce((s,t)=>{
        return s+t;
    },0)

    const semi=(total*discount_rate)/100;
    const final=total-semi;

    return final;
}

console.log(total_cost(10,100,100,100));
