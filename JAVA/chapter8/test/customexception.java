package test;

class InvalidAgeException1 extends Exception{
	public InvalidAgeException1(String s) {
		super(s);
	}
}



public class customexception {
	public static void main(String[] args) {
		int age=16;
		
		try {
			if(age<18) {
				throw new InvalidAgeException1("not eligible");
			}else {
				System.out.println("eligible");
			}
		
		}catch(Exception E) {
			System.out.println(E.getMessage());
			

}
}
}