package part2;
//REPLACE ALL 0’S WITH 1 IN A GIVEN INTEGER.
public class que5 {
public static void main(String[] args) {
	
	int num=20401;
	int reverse=0;
	int n=num;
	
	while(num!=0) {
		int rem=num%10;
		if(rem==0) {
			rem=1;
		}
		reverse=(reverse*10)+rem;
		num = num/10;
	}
	
	while(reverse!=0) {
		int rem=reverse%10;
		num=(num*10)+rem;
		reverse=reverse/10;
	}
	
	System.out.println(num);
	
}
}
