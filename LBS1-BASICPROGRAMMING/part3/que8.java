package part3;
//WRITE A PROGRAM TO CONVERT A DECIMAL TO HEXA
//DECIMAL

public class que8 {
public static void main(String[] args) {
	char[] ch = {
		    '0','1','2','3','4','5','6','7','8','9',
		    'A','B','C','D','E','F'
		};
	int num=62;
	String hexa="";
	
	while(num!=0) {
		int rem=num%16;
		hexa=ch[rem]+hexa;
		num=num/16;
	}
	
	System.out.println(hexa);
}
}
