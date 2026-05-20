package test;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String s) {
		super(s);
	}
}
public class mains {
	public static void main(String[] args) {
		int age=16;
		
		try {
			if(age<18) {
				throw new InvalidAgeException("invalid age not able to vote");
			}
			else {
				System.out.println("eligible to vote");
			}
		
			
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
			System.out.println("caought successfully");
		}
	}

}
