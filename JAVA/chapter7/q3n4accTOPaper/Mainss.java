package q3n4accTOPaper;

import java.util.Objects;

class Emp implements Cloneable{
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
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
	
	
	
}



public class Mainss {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Emp emp = new Emp(1, "Aditya");
		Emp empclone=(Emp)emp.clone();
		System.out.println(empclone);
		
		
		//for hashcode and equals
		Emp emp2 = new Emp(1, "Aditya");
		
		System.out.println(emp2.equals(emp));
		
		
	}

}
