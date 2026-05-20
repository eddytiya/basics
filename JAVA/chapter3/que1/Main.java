package que1;

//Show an example of parameterised constructor (with real-time example)

class Vehicle{
	
	int vehicle_ID;
	String Vehicle_name;
	public Vehicle(int vehicle_ID, String vehicle_name) {
		super();
		this.vehicle_ID = vehicle_ID;
		Vehicle_name = vehicle_name;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicle_ID=" + vehicle_ID + ", Vehicle_name=" + Vehicle_name + "]";
	}
	
	void disp() {
		System.out.println(vehicle_ID);
		System.out.println(Vehicle_name);
	}
}


public class Main {
public static void main(String[] args) {
	
  Vehicle vehicle = new Vehicle(123, "MG_hector");
  
  vehicle.disp();
	
	
	
	
	
}
}
