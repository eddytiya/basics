package part10;

public class que4 {
public static void main(String[] args) {
	String str="hello world";
	char [] ch=str.toCharArray();
	
	for(int i=0;i<ch.length;i++) {
		if(ch[i]==' ') {
			continue;
		}
		int count=1;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
				ch[j]=' ';
			}
		}
		
		if(ch[i]!=' ') {
			System.out.println(ch[i]+"is repeated"+count); 
			
		}
	}
}
}
