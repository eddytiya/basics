package que4;

class Emp{
	String name;
	double salary;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}



public class Main {
public static void main(String[] args) {
	
	Emp emp = new Emp();
	emp.setId(1);
	emp.setName("aditya");
	emp.setSalary(20000.00);
	
	System.out.println(emp.getId());
	System.out.println(emp.getName());
	System.out.println(emp.getSalary());
	
}
}
