package part10;

public class que7 {
public static void main(String[] args) {
	String str="Hello";
	char target='l';
	String result="";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=target) {
			result=result+str.charAt(i);
		}
	}
	System.out.println(result);
	
}
}
