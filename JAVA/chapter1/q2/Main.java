package q2;

class Emp{
	
	static String c_name="xyz";
	static String c_address="Dadar";
	
	int id;
	String name;
	
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
	static void comp_info() {
		System.out.println(c_name+" "+c_address);
		
	}
	
	void emp_info() {
		System.out.println(id+" "+name);
		
	}
	
}



public class Main {
public static void main(String[] args) {
	
	Emp emp =new Emp(123, "Aditya");
	emp.emp_info();
	Emp.comp_info();
	
}
}
