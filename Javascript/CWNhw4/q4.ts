// Demonstrate an example for abstract class.



abstract class Books{

    //extra acc to def
    book_details(){
        let book_name:string="stilton Germinico Stilton";
        let book_publishyear:number=2009;

        console.log(book_name);
        console.log(book_publishyear);
        
        
    }

    static book_loc(){
        let location_place:string="goregaon"

        console.log(location_place);
        
    }

    abstract getbook():void;
    abstract returnbook():void;

    

}

class Issuer extends Books{
    getbook(): void {
        console.log("get book");
        
    }
    returnbook(): void {
        console.log("return book");
        
        
    }
}

const i = new Issuer();
i.book_details();
i.returnbook();
i.getbook();

Books.book_loc();