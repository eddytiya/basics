package testing;
interface A1{
	void methA();
}

abstract class B1{
	abstract void methB();
}

class C1{
	void methc() {
		
	}
}
public class que1replay {
	public static void main(String[] args) {
		
		A1 a1 = new A1() {
			
			@Override
			public void methA() {
				System.out.println("interface");
			}
		};
		
		B1 b1 =new B1() {
			
			@Override
			void methB() {
				System.out.println("abstarct method");
				
			}
		};
		
		C1 c1 =new C1(){
			
			@Override
			void methc() {
				System.out.println("class");
				
			}
		};
		
		c1.methc();
		a1.methA();
		b1.methB();
	}

}
