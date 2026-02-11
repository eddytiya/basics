package part9;
//WRITE A PROGRAM TO COUNT THE SUM OF NUMBERS IN A STRING
public class que6 {
public static void main(String[] args) {
	String str="12b4";
	int sum=0;
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)>='0' && str.charAt(i)<='9') {
			int n=str.charAt(i);
			sum =sum+(n-48);
		}
		
	}
	System.out.println(sum);
}
}
