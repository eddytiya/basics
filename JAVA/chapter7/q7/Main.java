package q7;

import java.lang.reflect.Method;

public class Main {

	void meth() {
		System.out.println(" this is a method");
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		Method method[]=main.getClass().getMethods();
		
		
		for (int i=0;i<method.length;i++) {
			System.out.println(method[i]);
		}
	}

}
