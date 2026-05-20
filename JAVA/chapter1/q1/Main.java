package q1;
	class Emp{
		String name;
		int id;
		double sal;
		String address;
		public Emp(String name, int id, double sal, String address) {
			super();
			this.name = name;
			this.id = id;
			this.sal = sal;
			this.address = address;
		}
		@Override
		public String toString() {
			return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
		}
		
		void disp() {
			System.out.println(this.name);
			System.out.println(this.id);
			System.out.println(this.sal);
			System.out.println(this.address);
		}
		
		
	}
	
	public class Main {
	public static void main(String[] args) {
	
	Emp emp = new Emp("aditya", 123, 20000, "Goregaon");
	emp.disp();
	
}
}
