package part6;
//WRITE A PROGRAM TO SORT AN ARRAY ACCORDING TO
//THE ORDER DEFINED BY ANOTHER ARRAY
public class que8th {
public static void main(String[] args) {
	int [] A= {1,2,3,4,5,6,7,8,9,1,2,3,4};
	int [] B= {1,2,3,4};
	
	int [] result=new int[A.length];
	int index=0;
	
	for(int i=0;i< B.length;i++) {
		for(int j=0;j<A.length;j++) {
			if(B[i]==A[j]) {
				result[index]=A[j];
				index++;
				A[j]=-1;
			}
		}
		
	}
	for(int i=0;i< A.length;i++) {
		if(A[i]!=-1) {
			result[index]=A[i];
			index++;
		}
	}
	
	for(int i=0;i< result.length;i++) {
		System.out.print(result[i]+" ");
	}
		
	
}
}
