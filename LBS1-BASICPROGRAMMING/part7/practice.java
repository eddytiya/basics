package part7;
//MOVE ALL ZEROS TO THE END OF AN ARRAY.

public class practice {
public static void main(String[] args) {
	int [] arr= {1,0,2,0,3,0,4};
	int index=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			arr[index]=arr[i];
			index++;
		}
	}
	while(index<arr.length) {
		arr[index]=0;
		index++;
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	}
}
