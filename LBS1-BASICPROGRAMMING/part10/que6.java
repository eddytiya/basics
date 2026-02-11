package part10;

public class que6 {
public static void main(String[] args) {
	String str="hello";
	char []ch =str.toCharArray();
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ') {
			continue;
		}
		int count=0;
		for(int j =i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
				ch[j]=' ';
			}
		}
	}
	System.out.println(ch);
}
}
