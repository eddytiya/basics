"use strict";
// Demonstrate an example for abstract class.
class Books {
    //extra acc to def
    book_details() {
        let book_name = "stilton Germinico Stilton";
        let book_publishyear = 2009;
        console.log(book_name);
        console.log(book_publishyear);
    }
    static book_loc() {
        let location_place = "goregaon";
        console.log(location_place);
    }
}
class Issuer extends Books {
    getbook() {
        console.log("get book");
    }
    returnbook() {
        console.log("return book");
    }
}
const i = new Issuer();
i.book_details();
i.returnbook();
i.getbook();
Books.book_loc();
