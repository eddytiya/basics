package part2;
//CONVERT A DECIMAL NUMBER TO BINARY
public class que3 {
public static void main(String[] args) {
	
	int num=6;
	String binary="";
	
	while(num!=0) {
		int rem = num%2;
		binary=rem+binary;
		num=num /2;
	}
	System.out.println(binary);
	
}
}
