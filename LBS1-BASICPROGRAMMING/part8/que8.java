package part8;
//PARENTHESIS CHECKER
public class que8 {
public static void main(String[] args) {
	String str="(a+b) ";
	int count=0;

	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='(') {
			count++;
		}else if(str.charAt(i)==')') {
			count--;
		}
		
		if(count<0) {
			break;
		}
	}
	
	if(count==0) {
		System.out.println("balanced");
	}else {
		System.out.println("not balanced");
	}
}
}
