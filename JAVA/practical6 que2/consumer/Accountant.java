package consumer;

import companyImplementor.policyImplementor;

public class Accountant extends policyImplementor {

	@Override
	public double calsal(double salary) {
		return salary;
	}

	@Override
	public double calsal(double salary, double bonus) {
		return salary+bonus;
	}

	@Override
	public double calsal(double salary, double bonus, double tax) {
		return salary+bonus-tax;
	}
	
	
}
