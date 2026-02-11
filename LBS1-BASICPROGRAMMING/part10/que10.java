package part10;

public class que10 {
    public static void main(String[] args) {

    	String str = "Apple is Orange Umbrella";

        int count = 0;

        // CHECK FIRST WORD (unchanged logic)
        if (str.charAt(0)=='A'||str.charAt(0)=='E'||str.charAt(0)=='I'||str.charAt(0)=='O'||str.charAt(0)=='U'||
            str.charAt(0)=='a'||str.charAt(0)=='e'||str.charAt(0)=='i'||str.charAt(0)=='o'||str.charAt(0)=='u') {
            count++;
        }

        // CHANGE 1: for-loop moved OUTSIDE the above if block
        // so that remaining words are checked even if first word is not vowel
        for (int i = 0; i < str.length() - 1; i++) {   // CHANGE 2: length-1 to avoid i+1 out of bounds
            if (str.charAt(i) == ' ') {
                if (str.charAt(i + 1)=='A'||str.charAt(i + 1)=='E'||str.charAt(i + 1)=='I'||str.charAt(i + 1)=='O'||str.charAt(i + 1)=='U'||
                    str.charAt(i + 1)=='a'||str.charAt(i + 1)=='e'||str.charAt(i + 1)=='i'||str.charAt(i + 1)=='o'||str.charAt(i + 1)=='u') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
