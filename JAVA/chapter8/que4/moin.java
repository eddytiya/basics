package que4;



class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class moin {
    public static void main(String[] args) {

        int age = 16; // test value

        try {
            if (age < 18) {
                throw new MyException("Invalid Age: You are not eligible");
            } else {
                System.out.println("Valid Age: You can proceed");
            }
        } 
        catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println("Exception caught");
        }
    }
}