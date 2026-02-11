package part4;
//WRITE A PROGRAM TO FIND THE SUM OF ALL PRIME
//NUMBERS BETWEEN GIVEN RANGE
public class que1 {
	public static boolean isprime(int num) {
		for(int i=2;i<num;i++) {
		if(num%i==0) {
			return false;
		}
		
		}
		return true;
	}
public static void main(String[] args) {
	
	int start=2;
	int range=10;
	int sum=0;
	
	for(int i=start;i<=range;i++) {
		if(isprime(i)) {
			sum=sum+i;
		}
	}
	System.out.println(sum);
	
	
	
}
}
