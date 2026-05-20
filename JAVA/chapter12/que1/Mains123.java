package que1;

import java.util.ArrayList;
import java.util.List;




public class Mains123 {
	public static void main(String[] args) {
	
		
		EmpPojo empPojo1 = new EmpPojo(1, "tom", 12000);
		EmpPojo empPojo2 = new EmpPojo(2, "jerry", 22000);
		EmpPojo empPojo3 = new EmpPojo(3, "labubu", 32000);
		EmpPojo empPojo4 = new EmpPojo(4, "peter", 42000);
		
		List<EmpPojo> empPojos = new ArrayList<EmpPojo>();
		
		empPojos.add(empPojo1);
		empPojos.add(empPojo2);
		empPojos.add(empPojo3);
		empPojos.add(empPojo4);
		
		
		OperationImplementor implementor = new OperationImplementor();
		implementor.insertData(empPojos);
		implementor.show();
		System.out.println("------------------------------------------------------");
		
		
		implementor.updateData(3, "labubuSahil");
		implementor.show();
		System.out.println("--------------------------------------------------------");
		
		implementor.deleteData(3);
		implementor.show();
		System.out.println("--------------------------------------------------------");
		
		implementor.search(4);
		
		
		
	}

}

