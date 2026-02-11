package part7;

//FIND THE NEAREST SMALLER NUMBERS ON THE LEFT SIDE IN AN ARRAY.
public class que4 {
	public static void main(String[] args) {
		
		int [] arr= {9,1,2,3,4,5,6,7,8};
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
				
			}
		}
		System.out.println(min);
		
	}

}
