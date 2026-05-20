package q7;


//abstraction
abstract class Hospital{
	int id;
	String name;
	int age;
	String gender;
	String phone;
	public Hospital(int id, String name, int age, String gender, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	
	abstract void display();
	abstract void register();
	abstract void update();
	abstract void delete();
	abstract void show();
}

//inheritance

class Doctor extends Hospital{
	
	String specialization;
    double salary;
    int experience;
    String department;
    String shift;
    
    //constructor
	public Doctor(int id, String name, int age, String gender, String phone, String specialization, double salary,
			int experience, String department, String shift) {
		super(id, name, age, gender, phone);
		this.specialization = specialization;
		this.salary = salary;
		this.experience = experience;
		this.department = department;
		this.shift = shift;
	}

	@Override
	void display() {
		System.out.println("Doctor details");
	}

	@Override
	void register() {
		System.out.println("Register doctor details");
	}

	@Override
	void update() {
		System.out.println("Update doctor details");
	}

	@Override
	void delete() {
		System.out.println("Delete doctor details");
	}

	@Override
	void show() {
		System.out.println("Show doctor details");
	}
}


//second subdomain

class Patient extends Hospital{
	
	String disease;
	int roomNo;
	double bill;
	String admitDate;
	String doctorName;

	public Patient(int id, String name, int age, String gender, String phone,
			String disease, int roomNo, double bill, String admitDate, String doctorName) {
		super(id, name, age, gender, phone);
		this.disease = disease;
		this.roomNo = roomNo;
		this.bill = bill;
		this.admitDate = admitDate;
		this.doctorName = doctorName;
	}

	@Override
	void display() {
		System.out.println("Patient details");
	}

	@Override
	void register() {
		System.out.println("Register patient details");
	}

	@Override
	void update() {
		System.out.println("Update patient details");
	}

	@Override
	void delete() {
		System.out.println("Delete patient details");
	}

	@Override
	void show() {
		System.out.println("Show patient details");
	}
}


public class Abstraction {
public static void main(String[] args) {
    
    // ✅ SAME polymorphism style (unchanged)
    Hospital p = new Doctor(123, "aditya", 23, "male", "8108225326",
            "mind", 100000, 5, "ICU", "A");
    
    p.display();
    p.register();
    p.update();
    p.delete();
    p.show();
    
    
    
    System.out.println("==============================================================");
    // reuse same variable (same style)
    p = new Patient(124, "rahul", 25, "male", "9999999999",
            "fever", 101, 2000, "today", "Dr.A");
    
    p.display();
    p.register();
    p.update();
    p.delete();
    p.show();
}
}