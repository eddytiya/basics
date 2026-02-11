package part9;
//WRITE A PROGRAM TO COUNT THE NUMBER OF WORDS
//IN A STRING

public class que3 {
public static void main(String[] args) {
	String str="hello good morning amaste kemono acho";
	int count=1;
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ') {
			count++;
		}
	}
	System.out.println("total characters in a string are "+count);
}
}
