package part4;
//WRITE A PROGRAM TO FIND THE FACTORIAL OF A
//NUMBER USING RECURSION
public class que2 {
	public static int fact(int num) {
		if(num==1) {
			return 1;
		}
		return num*fact(num-1);
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
		
	}

}
