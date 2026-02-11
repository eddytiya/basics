package part9;
//WRITE A PROGRAM TO SPLIT A STRING

public class que7 {
	public static void main(String[] args) {
		String s="hello world";
		String[] str=new String[s.length()];
		int index=0;
		String new_s="";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				str[index]=new_s;
				new_s="";
				index++;
			}
			else if(i==s.length()-1) {
				new_s=new_s+s.charAt(i);
				str[index]=new_s;
				index++;
				new_s="";
			}
			else {
				new_s=new_s+s.charAt(i);
			}
		}
		// PRINTING FIX
        for (int i = 0; i < index; i++) {
            System.out.println(str[i]);
        }
	}

}
