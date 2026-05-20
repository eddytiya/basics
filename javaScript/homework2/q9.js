// Create a user-defined exception called InvalidCouponCode and demonstrate how it
// is used when a customer tries to apply an invalid coupon code during checkout.


class InvalidCouponCode extends Error{
    constructor(message) {
        super(message);
        this.name="InvalidCouponCode"    
    }
}


function coupon(code){
    if(code.length>8){
        try{
            throw new InvalidCouponCode("invalid coupon code")
        }catch(e){
            console.log(e.name+" "+e.message);
            
        }
    }else{
        console.log("valid coupon code");
        
    }
}

coupon("AB")
coupon("asdfghjkl")