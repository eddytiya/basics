package part2;
//WRITE A PROGRAM TO CALCULATE THE POWER OF A
//NUMBER
public class que8 {
	public static void main(String[] args) {
		
		int base=2;
		int exponent=3;
		int result=1;
		
		for(int i=1;i<=exponent;i++) {
			result=result*base;
		}
		System.out.println(result);
		
	}

}
