package part2;
//WRITE A PROGRAM TO CONVERT DAYS TO YEARS,
//WEEKS AND DAYS

public class que9 {
	public static void main(String[] args) {
		int num=1000;
		
		int years=(num/365);
		System.out.println(years);
		
		int weeks=(num%365)/7;
		System.out.println(weeks);
		
		int r_days=(num%365)%7;
		System.out.println(r_days);
	}

}
