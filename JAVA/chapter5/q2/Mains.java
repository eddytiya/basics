package q2;
//Show an example of co-variant return type

class A{
	A meth() {
		return this;
	}
}

class B extends A{
	B meth() {
		System.out.println("B");
		return this;
	}
	void meth1() {
		System.out.println("BB");
	}
}
public class Mains {
public static void main(String[] args) {
	
	B b = new B();
	b.meth().meth1();
	
}
}
