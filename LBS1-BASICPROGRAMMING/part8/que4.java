package part8;
//PRINT REPETITIVE CHARACTERS IN A STRING.
public class que4 {
public static void main(String[] args) {
	
	String str="hello GM";
	char []ch=str.toCharArray();
	
	for(int i=0;i<ch.length;i++) {
		if(ch[i]==' ') {
			continue;
		}
		int count=0;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
				ch[j]=' ';	
			}	
		}
		
		if(count>0) {
			System.out.println(ch[i]+"="+count);
		}
		
		
	}
	
}
}
