package que1;

abstract class Policy{
	static void company_info() {		
		System.out.println("company name is XYZ");
	}
	
	void emp_info() {
		System.out.println("name is aditya");
	}
	
	abstract void getRole();
	abstract void getSal();
	
}


class Employee extends Policy{

	@Override
	void getRole() {
		System.out.println("your are hired as DAta Analyst");
	}

	@Override
	void getSal() {
		System.out.println("you will have a starting sal of 20000");
	}
	
}




public class Mains {
public static void main(String[] args) {
	
	Employee employee = new Employee();
	employee.getSal();
	employee.getRole();
	
	employee.emp_info();
	
	Employee.company_info();
	
}
}
