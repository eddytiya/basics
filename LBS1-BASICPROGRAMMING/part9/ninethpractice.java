package part9;
//CHECK IF TWO STRINGS ARE EQUAL OR NOT.
public class ninethpractice {
public static void main(String[] args) {
	String s1="hello";
	String s2="hello";
	
	
	if(s1.length()==s2.length()) {
		boolean isequal=true;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
			isequal=false;
			break;
			}
		}
		
		if(isequal) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
}
