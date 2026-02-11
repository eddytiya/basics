package part5;
//REMOVE DUPLICATE ELEMENTS FROM AN ARRAY.
public class que3 {
public static void main(String[] args) {
	int [] arr={2,0,1,5,0,1};
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==0) {
			continue;
		}
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				arr[j]=0;
			}
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
