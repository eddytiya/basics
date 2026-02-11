package part3;
//WRITE A PROGRAM TO CONVERT A BINARY NUMBER TO
//DECIMAL
public class que9 {
	public static void main(String[] args) {
		int num=110;
		int decimal=0;
		int base=1;
		
		while(num!=0) {
			int rem=num%10;
			decimal=decimal+rem*base;
			base=base*2;
			num=num/10;
		}
		
		System.out.println(decimal);
	}

}
