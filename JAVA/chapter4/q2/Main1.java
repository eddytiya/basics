package q2;

class Emp1{
	int id;
	String name;
	public Emp1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp1 [id=" + id + ", name=" + name + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("deleted successfully");
	}
}



public class Main1 {
public static void main(String[] args) {
	
	Emp1 emp = new Emp1(1, "aditya");
	emp=null;
	System.gc();
	
}
}
