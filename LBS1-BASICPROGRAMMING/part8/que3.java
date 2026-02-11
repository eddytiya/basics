package part8;
//REVERSING THE ORDER OF WORDS IN A SENTENCE.
public class que3 {
	public static void reverse(char[]ch,int i,int j) {
		while(i<j) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
			
		}
	}
	
public static void main(String[] args) {
	String str="Hello Good Morning";
	char [] ch=str.toCharArray();
	int i=0;
	reverse(ch,0,ch.length-1);
	
	for(int j=0;j<ch.length;j++) {
		if(ch[j]==' ') {
			reverse(ch,i,j-1);
			i=j+1;
		}
	}
	reverse(ch,i,ch.length-1);
	System.out.println(ch);
	
}
}
