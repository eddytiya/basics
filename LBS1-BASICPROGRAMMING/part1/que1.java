package part1;
//CHECK IF A NUMBER IS PRIME.
public class que1 {
	public static void main(String[] args) {
		int num=5;
		boolean isprime=true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isprime=false;
				
			}
			
		}
		if(isprime) {
			System.out.println("yes");
		}else {
			System.out.println("false");
		}
		
		
	}

}
