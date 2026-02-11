package part10;

public class que2 {
	public static void main(String[] args) {
		String str="hello world";
		char target='l';
		
		int lcount=0;
		int rcount=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==target) {
				break;
			}
			lcount++;
		}
		
		for(int i=str.length()-1;i>=1;i--) {
			if(str.charAt(i)==target) {
				break;
			}
			rcount++;
			
		}
		
		if(rcount>lcount) {
			System.out.println(rcount);
		}else {
			System.out.println(lcount);
		}
		
	}

}
