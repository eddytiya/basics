package testing;

interface A{
	void methA();
}

abstract class B{
	abstract void methB();
}

class C{
	void methc(){
		
	}
}
public class qeu1 {
	public static void main(String[] args) {
		A a =new A() {
			
			@Override
			public void methA() {
				System.out.println("hi");
			}
		};
		
		B b = new B() {
			
			@Override
			void methB() {
				System.out.println("hello");
			}
		};
		
		C c =new C(){
			
			@Override
			void methc() {

System.out.println("lets goooo");
			}
		};
		c.methc();
		a.methA();
		b.methB();
	
}

}
