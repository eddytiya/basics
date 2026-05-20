package que1;

interface Accountant {
    
    double calculateSalary(double sal);
    double calculateSalary(double sal, double bonus);
    double calculateSalary(double sal, double bonus, double tax);
}

class Employee1 implements Accountant {

    @Override
    public double calculateSalary(double sal) {
        return sal;
    }

    @Override
    public double calculateSalary(double sal, double bonus) {
        return sal + bonus;
    }

    @Override
    public double calculateSalary(double sal, double bonus, double tax) {
        return sal + bonus - tax;
    }
}

public class Mainss {
    public static void main(String[] args) {

        Employee1 emp = new Employee1();

        System.out.println("Basic Salary: " + emp.calculateSalary(1000));
        System.out.println("Salary + Bonus: " + emp.calculateSalary(1000, 500));
        System.out.println("Final Salary (after tax): " + emp.calculateSalary(1000, 500, 200));
    }
}