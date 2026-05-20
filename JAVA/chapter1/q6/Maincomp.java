package q6;

class Hobbies1 {
    String H1;
    String H2;

    public Hobbies1(String h1, String h2) {
        H1 = h1;
        H2 = h2;
    }

    @Override
    public String toString() {
        return "Hobbies1 [H1=" + H1 + ", H2=" + H2 + "]";
    }
}

class Address1 {
    String cityname;
    String areaname;

    public Address1(String cityname, String areaname) {
        this.cityname = cityname;
        this.areaname = areaname;
    }

    @Override
    public String toString() {
        return "Address1 [cityname=" + cityname + ", areaname=" + areaname + "]";
    }
}

class Emp1{
	
	int id;
	String name;
	
	Hobbies1 hobbies1;
	Address1 address1;
	public Emp1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		this.hobbies1=new Hobbies1("chugli", "karna");
		this.address1 =new Address1("mumbai", "goregaon");
	}
	@Override
	public String toString() {
		return "Emp1 [id=" + id + ", name=" + name + ", hobbies1=" + hobbies1 + ", address1=" + address1 + "]";
	}
	
	
}

public class Maincomp {
    public static void main(String[] args) {
    	
    	Emp1 emp = new Emp1(123, "aditya");

        System.out.println(emp);

    	
    }
}