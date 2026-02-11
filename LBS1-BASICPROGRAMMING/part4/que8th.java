package part4;
//FIND THE SECOND LARGEST NUMBER IN AN ARRAY.
public class que8th {
	public static void main(String[] args) {
		int [] arr= {4,3,1,2,5};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println(arr[arr.length-2]);
		
	}

}
