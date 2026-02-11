package part2;
//CALCULATE THE SQUARE ROOT OF A NUMBER.
public class que2 {
public static void main(String[] args) {
	
	double num=25;
	double sqrt=0;
	
	for(double i=1;i*i<=num;i = i + 0.001) {
		sqrt=i;
	}
	System.out.println(sqrt);
	
}
}
