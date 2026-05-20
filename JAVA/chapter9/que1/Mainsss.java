package que1;

interface A{
	void meth();
};

abstract class B{
	abstract void meth();
}

class C{
	void meth() {
		
	}
}


public class Mainsss {
public static void main(String[] args) {
	
	
	A a =new A() {
		
		@Override
		public void meth() {
			System.out.println("this is an interface");
		}
	};
	
	B b =new B() {
		
		@Override
		void meth() {
			System.out.println("this is an abstract method");
			
		}
	};
	
	C c =  new C() {
		
		@Override
		public void meth() {
			System.out.println("this is a normal class");
		}
	}; 
	a.meth();
	b.meth();
	c.meth();
	
	}
}

	
	
	



