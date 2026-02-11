package part8;
//CHECK IF STRINGS CONTAIN ONLY DIGITS.
public class que7 {
public static void main(String[] args) {
	String str="124";
	boolean isDigit=true;
	
	for(int i=0;i<str.length();i++) {
		
		if(str.charAt(i)>='0' && str.charAt(i)<='9') {
			isDigit=true;
		}
		else {
			isDigit=false;
		}
		
	}
	if(isDigit) {
		System.out.println("yes");
	}else {
		System.out.println("nooo");
	}
}
}
