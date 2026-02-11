package part10;

public class que1 {
	public static void main(String[] args) {
		String str="hello world";
		int length=0;
		
		for(int i=str.length()-1;i>=1;i--) {
			if(str.charAt(i)==' ') {
				break;
			}
			length++;
			
		}
		System.out.println(length);
	}

}
