package part7;
// WRITE A PROGRAM TO REARRANGE THE ARRAY IN
// ALTERNATING POSITIVE AND NEGATIVE ITEMS WITH
// O(1) EXTRA SPACE

public class que2 {
    public static void main(String[] args) {

        int[] arr = {4,-2,8,9,-1,-7};
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

        int neg = 1;
        for (int pos = index; pos < arr.length && neg < arr.length; pos++) {
            if (arr[neg] <= 0 && arr[pos] >= 0) {
                int temp = arr[pos];
                arr[pos] = arr[neg];
                arr[neg] = temp;
            }
            neg = neg + 2;
        }

        // PRINTING (FIXED ONLY)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
