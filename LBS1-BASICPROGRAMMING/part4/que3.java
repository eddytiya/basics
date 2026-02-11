package part4;
//WRITE A PROGRAM TO Reverse Digits of a Number

public class que3 {
public static void main(String[] args) {
	int num=12345;
	int reverse=0;
	int n=num;
	
	while(num!=0) {
		int rem=num%10;
		reverse=(reverse*10)+rem;
		num=num/10;
		
	}
	System.out.println(reverse);
}
}
