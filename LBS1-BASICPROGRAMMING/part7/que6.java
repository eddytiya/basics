package part7;
//CHECK IF TWO STRINGS ARE ANAGRAMS.
public class que6 {
	public static void bubbleSort(char[]ch) {
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length-1;j++) {
				if(ch[j]>ch[j+1]) {
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
	}
public static void main(String[] args) {
	
	String s1="ten";
	String s2="net";
	
	if(s1.length()==s2.length()) {
		char [] c1=s1.toCharArray();
		char [] c2=s2.toCharArray();
		
		bubbleSort(c1);
		bubbleSort(c2);
		
		boolean isana=true;
		
		for(int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i]) {
				isana=false;
				break;
				
			}
		}
		if(isana) {
			System.out.println("yea");
		}else {
			System.out.println("nope");
		}
	}
	
	
}
}
