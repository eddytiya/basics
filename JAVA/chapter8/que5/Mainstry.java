package que5;

public class Mainstry {
public static void main(String[] args) {
	try {
		int arr[]= new int[5];
		arr[6]=50/0;
	}
	
	catch (ArithmeticException e) {
		System.out.println("task 1 handled successfully");
	}
	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("task2 handled");
	}
	
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("rest of the code");
}
}
