package part7;
//WRITE A PROGRAM TO CONVERT A TWO-DIMENSIONAL ARRAY TO A ONE-DIMENSIONAL ARRAY?

public class que3 {
public static void main(String[] args) {
	
	int[][] arr = {
		    {1, 2, 3},
		    {4, 5, 6},
		    {7, 8, 9}
		};
	
	int []oneD=new int[arr.length*arr[0].length];
	
	int index=0;
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
		oneD[index]=arr[i][j];
		index++;
	}}
	
}
}
