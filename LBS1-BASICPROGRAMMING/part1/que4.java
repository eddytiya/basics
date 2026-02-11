package part1;
//CHECK IF A NUMBER IS ARMSTRONG
public class que4 {
public static void main(String[] args) {
	int num =153;
	int sum=0;
	int n=num;
	
	while(num!=0) {
		int rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
	}
	
	System.out.println(sum);
	if(n==sum) {
		System.out.println("is armstrong");
	}else {
		System.out.println("not armsrong");
	}
}
}
