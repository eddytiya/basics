package q6;

class Hobbies{
	String H1;
	String H2;
	public Hobbies(String h1, String h2) {
		super();
		H1 = h1;
		H2 = h2;
	}
	@Override
	public String toString() {
		return "Hobbies [H1=" + H1 + ", H2=" + H2 + "]";
	}
	
}

class Address{
	String cityname;
	String areaname;
	public Address(String cityname, String areaname) {
		super();
		this.cityname = cityname;
		this.areaname = areaname;
	}
	@Override
	public String toString() {
		return "Address [cityname=" + cityname + ", areaname=" + areaname + "]";
	}
}

class Emp{
	int id; 
	String name;
	
	Hobbies hobbies;
	Address address;
	public Emp(int id, String name, Hobbies hobbies, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", hobbies=" + hobbies + ", address=" + address + "]";
	}
}


public class Main {
public static void main(String[] args) {
	
	Hobbies hobbies = new Hobbies("music", "football");
	Address address = new Address("Mumbai", "goregaon");
	
	Emp emp = new Emp(123, "aditya", hobbies, address);
	
	System.out.println(emp.hobbies.H1);
	System.out.println(emp.hobbies.H2);
	
	System.out.println(emp.address.cityname);
	System.out.println(emp.address.areaname);
	
}
}
