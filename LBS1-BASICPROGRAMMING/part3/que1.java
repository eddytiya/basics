package part3;
//WRITE A PROGRAM TO CONVERT DECIMAL TO OCTAL
public class que1 {
	public static void main(String[] args) {
		 int num=8;
		 String octal="";
		 
		 while(num!=0) {
			 int rem=num%8;
			 octal=rem+octal;
			 num=num/8;
		 }
		 System.out.println(octal);
	}

}
