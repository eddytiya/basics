package part2;
//FIND THE SUM OF DIGITS OF A NUMBER USING
//RECURSION
public class que4 {
	public static int sumof(int num) {
		if(num==0) {
			return 0;
		}
		int rem= num%10;
		return rem+sumof(num/10);
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(sumof(54));
		
		
		
	}
	

}
