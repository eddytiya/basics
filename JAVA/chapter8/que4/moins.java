package que4;

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String s) {
		super(s);
	}
	
}


	



public class moins {
public static void main(String[] args) {
	
	int age=16;
	
	try {
		if(age<18) {
			throw new InvalidAgeException("invalid age you are not eligibe to vote");
		}else {
			System.out.println("you are eligible to vote");
		}
	}catch( InvalidAgeException e) {
		System.out.println(e.getMessage());
		System.out.println("caught");
	}
	
}
}
