package que2;



class A2{
	void a() {
		
	}
}

class B2{
	void b(){
		
	}
}

class C2{
	void c() {
		
	}
}

class D2{
	void d(A2 a,B2 b,C2 c) {
		a.a();
		b.b();
		c.c();
	}
}
public class Main {
	public static void main(String[] args) {
		D2 ob = new D2();
		ob.d(new A2() {

			@Override
			void a() {
			System.out.println("meth A");
			}
			
			
		},
				new B2() {

					@Override
					void b() {
						System.out.println("meth B");
					}
			
			
			
		},
				new C2() {

					@Override
					void c() {
						System.out.println("meth C");
					}
			
			
			
		});
	}

}
