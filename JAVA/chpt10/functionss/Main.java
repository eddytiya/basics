package functionss;

public class Main {
	public static void main(String[] args) {
		String str="  hello world how are you";
		String str1="  hello world how are you";
		
		
		//1.length
		
		System.out.println(str.length());
		
		//2.compareTo
		System.out.println(str.compareTo(str1));
		
		//3.concat
		
		System.out.println(str.concat(" ").concat(str1));
		
		//4.trim()
		System.out.println(str.trim());
		
		
		//5.replace
		
		System.out.println(str.replace('e', 'z'));
		
		//6.value of
		
		System.out.println(String.valueOf(true));
		
		//7.wrapper class
		int a=10;
		Integer integer =new Integer(a);
		System.out.println(integer);
		
		Integer integer2 = new Integer(20);
		int b=integer2;
		System.out.println(b);
		
	}

}
