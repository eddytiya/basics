package part8;
//REMOVING SPACES IN A STRING.
public class que2 {
	
	public static void main(String[] args) {
		String str="hello World";
		String n="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				continue;		
			}
			
			n=n+str.charAt(i);
		}
		System.out.println(n);
	}

}
