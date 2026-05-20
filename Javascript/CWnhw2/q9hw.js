// Create a user-defined exception called InvalidCouponCode and demonstrate how it
// is used when a customer tries to apply an invalid coupon code during checkout.


class InvalidCouponCode extends Error{
    constructor(message){
        super(message);
        this.name="InvalidCouponCode";

    }
}

function couponcode(code){
    try{
        if(code.length<4){
            throw new InvalidCouponCode("the length of the code should be min 4 characters......invalid coupon code")
        }
        else{
            console.log("valid code");
            
        }
    }catch(e){
        console.log(e.name+" "+e.message);
        
    }
}

couponcode("ABC");
couponcode("ABCd");
couponcode("ab")