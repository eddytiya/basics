package testing;

class A3{
	void metha() {
		
	}
}

class B3{
	void methb() {
		
	}
}

class C3{
	void methc() {
		
	}
}

class D3{
	void methd(A3 a,B3 b,C3 c) {
		a.metha();
		b.methb();
		c.methc();
		
		
	}
}

public class que2 {
	public static void main(String[] args) {
		 D3 ob=new D3();
		 
		 ob.methd(
			new A3(){

				@Override
				void metha() {
					System.out.println("meth A");
				}
				
			 
		 }, new B3(){

			@Override
			void methb() {
				System.out.println("meth B");
			}
			 
			 
		 }, new C3(){

			@Override
			void methc() {
				System.out.println("meth C");
			}
			 
			 
			 
		 });
	}

}
