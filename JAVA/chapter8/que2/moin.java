//package que2;
//
//
//
//import java.io.IOException;
//
//class A {
//	void a() throws IOException {
//		throw new IOException("Exception in A");
//	}
//}
//
//class B {
//	void b() throws IOException {
//		A a = new A();
//		a.a();
//	}
//}
//
//class C {
//	void c() {
//		try {
//			B b = new B();
//			b.b();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//}
//
//public class moin {
//	public static void main(String[] args) {
//		C c = new C();
//		c.c();
//	}
//}