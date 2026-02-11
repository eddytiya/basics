package part9;
//WRITE A PROGRAM TO REPLACE A SPECIFIC CHARACTER FROM A STRING
public class que8 {
public static void main(String[] args) {
	String str="banana";
	char old='a';
	char newchar='o';
	
	String result="";
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==old) {
			result=result+newchar;
		}
		else {
			result=result+str.charAt(i);
		}
	}
	System.out.println(result);
	
}
}
