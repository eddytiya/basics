package q5;

class Employees{
	int id;
	String name;
	public Employees(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("success");
	}
	
}





public class Mains {
public static void main(String[] args) {
	
	Employees employees = new Employees(1, "aditya");
	employees=null;
	System.gc();
	
}
}
