package part1;
//FIND THE FIBONACCI SERIES.
public class que5 {
	public static void main(String[] args) {
		
	
	int n1=0;
	int n2=1;
	int range=5;
	
	for(int i=1;i<=range;i++) {
		System.out.println(n1);
		int n3=n1+n2;
		n1=n2;
		n2=n3;
	}
	
	}

}
