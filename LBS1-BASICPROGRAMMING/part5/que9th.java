package part5;
//SEARCH AN ELEMENT IN A MATRIX
public class que9th {
public static void main(String[] args) {
	int[][] arr = {
		    {1, 2, 3},
		    {4, 5, 6},
		    {7, 8, 9}
		};
	
	int key=5;
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]==key) {
				System.out.println("element"+key+"found at row"+i+"column"+j);
			}
		}
	}
	
	

}
}
