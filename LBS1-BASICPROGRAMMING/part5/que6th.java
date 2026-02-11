package part5;
//FIND REPEATING ELEMENTS IN AN ARRAY.
public class que6th {
public static void main(String[] args) {
	int[] arr = {1,2,1 , 3, 4, 2, 1,1,2};
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==0) {
			continue;
		}
		int count=0;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				arr[j]=0;
				count++;
				
			}
		}
		if(count>0) {
			System.out.println(arr[i]+"is repeated "+count);
			
		}
	}
	
}
}
