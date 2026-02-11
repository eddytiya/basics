package part9;
//WRITE A PROGRAM FOR CAMEL CASE PATTERN
//MATCHING
public class que10 {
public static void main(String[] args) {
	String str="caMel";
	
	if(str.charAt(0)>='a' &&str.charAt(0)<='z') {
		boolean iscamel=true;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(0)>='A' &&str.charAt(0)<='Z') {
				iscamel=false;
				break;
			}
			
		}
		if(iscamel) {
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
}
