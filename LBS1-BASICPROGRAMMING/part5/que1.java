package part5;
//MEDIAN OF 2 SORTED ARRAYS OF EQUAL SIZE.
public class que1 {
public static void main(String[] args) {
	int [] arr1= {1,2,3,5};
	int [] arr2= {4,6,7,8};
	int [] arr3=new int[arr1.length+arr2.length];
	for(int i=0;i<arr1.length;i++) {
		arr3[i]=arr1[i];
	}
	for(int j=0;j<arr2.length;j++) {
		arr3[arr1.length+j]=arr2[j];
	}
	
	for(int i=0;i<arr3.length;i++) {
		for(int j=0;j<arr3.length-1;j++) {
			if(arr3[j]>arr3[j+1]) {
				int temp=arr3[j];
				arr3[j]=arr3[j+1];
				arr3[j+1]=temp;
			}
		}
	}
	
	int median=arr3.length/2;
	System.out.println((arr3[median-1]+arr3[median])/2);
		
}
}
