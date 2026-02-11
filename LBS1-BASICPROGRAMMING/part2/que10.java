 package part2;
//WRITE A PROGRAM TO FIND THE SUM OF EVEN
//NUMBERS BETWEEN A GIVEN RANGE
public class que10 {
public static void main(String[] args) {
	int start=1;
	int range=10;
	int sum=0;
	
	for(int i=start;i<=range;i++) {
		if(i%2==0) {
			sum=sum+i;
		}
	}
	System.out.println(sum);
}
}
