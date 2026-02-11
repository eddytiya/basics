package part1;
//FIND THE SUM OF DIGITS OF A NUMBER.
public class que7 {
	public static void main(String[] args) {
		int num=1234;
		int sum=0;
		
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}

}
