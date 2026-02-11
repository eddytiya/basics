package part3;
//WRITE A PROGRAM TO CHECK IF A NUMBER IS A
//PERFECT NUMBER OR NOT
public class que5 {
public static void main(String[] args) {
	int num=6;
	int sum=0;
	
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			sum=sum+i;
		}
	}
	if(num==sum) {
		System.out.println("perfect");
	}else {
		System.out.println("not");
	}
	System.out.println(sum);
}
}
