package Main;

import consumer.Accountant;
import consumer.Employee;
import consumer.Manager;

public class Main {
	public static void main(String[] args) {
		Accountant accountant = new Accountant();
		Employee employee = new Employee();
		Manager manager = new Manager();
		
		
		System.out.println(employee.calsal(10000, 200, 100));
		System.out.println(manager.calsal(10000, 1000));
		
		
	}

}
