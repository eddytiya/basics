package part4;
//CHECK THE EQUALITY OF TWO ARRAYS.
public class que9th {
public static void main(String[] args) {
	int [][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
	int [][] arr2= {{1,2,3},{4,5,6},{7,8,9}};
	
	boolean isequal=true;
	
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr2.length;j++) {
			if(arr1[i][j]!=arr2[i][j]) {
				isequal=true;
				break;
				
			}
		}
	}
	
	if(isequal) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
}
