package test;

class Hobbies{
	String h1;
	String h2;
	public Hobbies(String h1, String h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}
	@Override
	public String toString() {
		return "Hobbies [h1=" + h1 + ", h2=" + h2 + "]";
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
	public Emp(int id, String name, Hobbies hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
		this.address = new Address("Mumbai","goregaon");
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", hobbies=" + hobbies + ", address=" + address + "]";
	}
	
	
	
}


public class Main {
public static void main(String[] args) {
	
	Hobbies hobbies = new Hobbies("cricket", "football");
	
	Emp emp = new Emp(1, "aditya", hobbies);
	
	System.out.println(emp.address.cityname);
	System.out.println(emp.address.areaname);
	
	System.out.println(emp.hobbies.h1);
	System.out.println(emp.hobbies.h2);
	
}
}
