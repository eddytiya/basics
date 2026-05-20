package test;

public class Multicatch {
	public static void main(String[] args) {
		try {
			int arr[]=new int[5];
			arr[5]=50/0;
		}catch(ArithmeticException e) {
			System.out.println("task one completed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		}
		catch(Exception e) {
			System.out.println("common exception handled");
		}
		
		System.out.println("rest of your code");
	}

}
