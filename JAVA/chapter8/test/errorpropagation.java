package test;

import java.io.IOException;

class A{
	void a() throws IOException{
		IOException exception = new IOException();
		throw exception;
	}
}

class B{
	void b() throws IOException{
		A a = new A();
		a.a();
	}
}

class C{
	void c() {
		try {
			B b = new B();
			b.b();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}



public class errorpropagation {
public static void main(String[] args) {
	C c = new C();
	c.c();
}
}
