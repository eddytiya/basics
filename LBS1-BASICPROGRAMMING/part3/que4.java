package part3;
//WRITE A PROGRAM TO CHECK IF A NUMBER IS A
//STRONG NUMBER OR NOT

public class que4 {
	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		return fact;
	}
	public static void main(String[] args) {
		int num=145;
		int sum=0;
		int n=num;
		
		while(num!=0) {
			int rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
		}
		if(sum==n) {
			System.out.println("strong");
		}else {
			System.out.println("not ");
		}
		System.out.println(sum);
		
		
	}

}
