package part2;
//FIND NUMBER OF TIMES X DIGIT OCCURS IN A GIVEN
//INPUT
public class que6 {
	
	public static void main(String[] args) {
		int num=21411;
		int count=0;
		int x=1;
		
		while(num!=0) {
			int rem=num%10;
			if(rem==x) {
				count++;
			}
			num=num/10;
			
		
		}
		System.out.println(count);
	}

}
