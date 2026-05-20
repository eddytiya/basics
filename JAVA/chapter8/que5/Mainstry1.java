package que5;

public class Mainstry1 {
public static void main(String[] args) {
	try {
		int a[]= new int[5];
		a[5]=50/0;
	}
	
	catch(ArithmeticException e) {
		System.out.println("task1 complete");
	}
	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("task2 complete");
	}
	
	catch(Exception e) {
		System.out.println("common complete");
	}
	System.out.println("rest of the code");
}
}
