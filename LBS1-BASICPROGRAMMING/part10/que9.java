package part10;

public class que9 {
	
public static char upper(char ch) { 
	if(ch>='a' && ch<='z') {
		int n=ch;
		ch=(char)(n-32);
	}
	
	
	return ch;
}

public static  char lower(char ch) {
	if(ch>='A' && ch<='Z') {
		int n=ch;
		ch=(char)(n+32);
	}
	return ch;
}
public static void main(String[] args) {
	String str="hello world";
	char [] ch=str.toCharArray();
	
	for(int i=0;i<ch.length;i++) {
		if(i==0||i==ch.length-1) {
			ch[i]=upper(ch[i]);
		}
		
		if(ch[i]==' ') {
			ch[i+1]=upper(ch[i+1]);
			ch[i-1]=upper(ch[i-1]);
			
		}
	}
System.out.println(ch);
}
}
