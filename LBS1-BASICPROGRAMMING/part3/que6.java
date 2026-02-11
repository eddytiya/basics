package part3;
//WRITE A PROGRAM TO FIND THE SUM OF NATURAL
//NUMBERS USING RECURSION
public class que6 {
	public static int sum(int num) {
		if(num==1) {
			return 1;
		}
		return num+sum(num-1);
		
	}
public static void main(String[] args) {
	
	System.out.println(sum(10));
	
}
}
