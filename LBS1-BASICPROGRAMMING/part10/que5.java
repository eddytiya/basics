package part10;

public class que5 {
public static void main(String[] args) {
	byte [] by= {101,90,75};
	String result="";
	
	for(int i=0;i<by.length;i++) {
		result=result+(char)by[i];
	}
	System.out.println(result);
}
}
