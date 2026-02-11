package part5;
//ARRAY LEFT ROTATION BY D POSITIONS.
public class que7th {
public static void main(String[] args) {
	int [] arr= {1,2,3,4,5};
	
	int d=3;
	
	for(int j=0;j<d;j++) {
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
