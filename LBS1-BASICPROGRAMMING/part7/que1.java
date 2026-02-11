package part7;
//WRITE A PROGRAM TO MOVE ALL THE NEGATIVE ELEMENTS TO ONE SIDE OF THE ARRAY
public class que1 {
public static void main(String[] args) {
	int[] arr = {5, -3, 7, -1, -6, 4};
	int index=0;
	
	for(int i=0;i<arr.length;i++) {
		
			if(arr[i]>0) {
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			
			
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
