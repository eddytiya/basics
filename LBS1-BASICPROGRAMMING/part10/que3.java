package part10;

public class que3 {
public static void main(String[] args) {
	char ch='b';
	
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
		System.out.println("vowel");
		
	}else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')) {
		System.out.println("Consonent");
		
	}else {
		System.out.println("likeee");
	}
}
}
