package part6;
// WRITE A PROGRAM FOR ARRAY RIGHT ROTATION BY D POSITION
public class que10 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int d = 2;

        for (int j = 0; j < d; j++) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
    }
}
