package part7;
//CHECK WHETHER A STRING IS PALINDROME OR NOT.
public class que5th {
	public static void main(String[] args) {
		
		String str="level";
		int i=0;
		int j=str.length()-1;
		
		boolean ispalindrome=true;
		
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				ispalindrome=false;
				break;
			}
			i++;
			j--;
		}
		
		if(ispalindrome) {
			System.out.println("yeah");
		}
		else {
			System.out.println("nope");
		}
		
	}

}
