package part8;
//FIND THE FIRST NON-REPEATED CHARACTER IN A WORD.
public class que9 {
public static void main(String[] args) {
	
	String str="helloh";
	char [] ch=str.toCharArray();
	
	for(int i=0;i<ch.length;i++) {
		int count=0;
		for(int j=0;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
			}
			
		}
		if(count==1) {
			System.out.println(ch[i]+" is the first non repeated character");
			break;
		}
	}
	
}
}
