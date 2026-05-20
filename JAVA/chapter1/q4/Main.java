package q4;

class Emp{
	 double calsal(double sal){
		 return sal;
		 
	 }
	 
	 double calsal(double sal,double bonus){
		 return sal+bonus;
		 
	 }
	 
	 double calsal(double sal,double bonus,double tax){
		 return sal+bonus-tax;
		 
	 }
}



public class Main {
public static void main(String[] args) {
	
	Emp emp = new Emp();
	System.out.println(emp.calsal(1000));
	System.out.println(emp.calsal(1000, 100));
	System.out.println(emp.calsal(1000, 100,10));
	
	
	
	
	
}
}
