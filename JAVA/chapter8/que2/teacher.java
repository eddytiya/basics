package que2;

import java.io.IOException;

class A1{
	void a() throws IOException {
		IOException exception = new IOException();
		throw exception;
		
	}
}

class B1{
	void b() throws IOException{
		A1 a = new A1();
		a.a();
	}
}

class C1{
	void c(){
	try {	
		B1 b = new B1();
		b.b();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
	
}

public class teacher {
public static void main(String[] args) {
	C1 c = new C1();
	c.c();
	
}
}