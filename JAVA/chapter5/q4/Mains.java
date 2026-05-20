package q4;

//super

class A{
	int a=10;
	
	void meth() {
		System.out.println("A method");
	}
	
	public A(){
		System.out.println("constructor");
	}
}


class B extends A{
	
	void meth2() {
		System.out.println(super.a);
		super.meth();
	}
	
	public B() {
		super();
		
	}
}



public class Mains {
public static void main(String[] args) {
	
	B b =new B();
	
	b.meth2();
	
}
}
