package part5;
//FIND THE LARGEST SUM OF ELEMENTS FROM THE GIVEN
//TWO ARRAY.
public class que2 {
public static void main(String[] args) {
	int [] arr1= {1,2,3,5};
	int [] arr2= {4,6,7,8};
	
	int sum1=0;
	int sum2=0;
	
	for(int i=0;i<arr1.length;i++) {
		sum1+=arr1[i];
	}
	for(int j=0;j<arr2.length;j++) {
		sum2+=arr2[j];
	}
	
	if(sum1>sum2) {
		System.out.println("sum1 is bigger");
	}else if(sum1<sum2) {
		System.out.println("sum2 is bigger");
	}else {
		System.out.println("none");
	}
}
}
