package part1;
//CHECK IF A NUMBER IS A PERFECT SQUARE.
public class que8 {
	public static void main(String[] args) {
		
	
	int num=25;
	boolean isperfectSquare=false;
	
	for(int i=1;i*i<=num;i++) {
		if(i*i==num) {
			isperfectSquare=true;
			break;
		}
		
	}
	
	if(isperfectSquare) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	}

}
