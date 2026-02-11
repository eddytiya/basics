package part9;
//REVERSE A STRING
public class que2 {
public static void reverse(char [] ch,int i,int j){
	while(i<j) {	
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		i++;
		j--;
	}
		
}
public static void main(String[] args) {
	
	String str="hello";
	char[] ch=str.toCharArray();
	int i=0;
	reverse(ch,0,ch.length-1);
	
	System.out.println(ch);
	
	
	
}
}
