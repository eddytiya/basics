package part8;
// FIND THE NUMBER OF OCCURRENCES OF A SUBSTRING IN A STRING
public class que1 {
    public static void main(String[] args) {

        String str = "hello";
        String substr = "ell";
        int count = 0;   // FIX

        for (int i = 0; i <= str.length() - substr.length(); i++) {
            boolean ismatch = true;

            for (int j = 0; j < substr.length(); j++) {   // FIX
                if (str.charAt(i + j) != substr.charAt(j)) {  // FIX
                    ismatch = false;
                    break;
                }
            }

            if (ismatch) {
                count++;
            }
        }

        System.out.println(count);
    }
}
