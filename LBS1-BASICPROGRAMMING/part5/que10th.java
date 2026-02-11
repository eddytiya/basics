package part5;
//WRITE A PROGRAM TO SORT FIRST HALF IN ASCENDING
//ORDER AND SECOND HALF IN DESCENDING
public class que10th {
public static void main(String[] args) {
	int [] arr= {4,3,2,1,5,6,7,8};
	
	for(int i=0;i<arr.length/2;i++) {
		for(int j=0;j<(arr.length/2)-1;j++) {
			if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
		}
	}
	
	for(int i=arr.length/2;i<arr.length;i++) {
		for(int j=arr.length/2;j<arr.length-1;j++) {
			if (arr[j] < arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
}
}
