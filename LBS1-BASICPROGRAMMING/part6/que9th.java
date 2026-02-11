package part6;
//WRITE A PROGRAM TO DIVIDE 1 ARRAY INTO TWO ARRAY
public class que9th {
	public static void main(String[] args) {
	int [] arr= {1,2,3,4,5,6,7,8};
	
	int[] arr1=new int[arr.length/2];
	int[] arr2=new int[arr.length/2];
	
	for(int i=0;i<arr.length/2;i++) {
		arr1[i]=arr[i];
	}
	for(int i=arr.length/2;i<arr.length;i++) {
		arr2[i-arr1.length]=arr[i];
	}
	
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	
	for(int i=0;i<arr2.length;i++) {
		System.out.print(arr2[i]+" ");
	}
	
	}

}
