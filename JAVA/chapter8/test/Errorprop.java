package test;

import java.io.IOException;

class AA{
	void a() throws IOException{
		IOException exception = new IOException();
		throw exception;
	}
}

class BB{
	void b() throws IOException{
		AA aa =new AA();
		aa.a();
		
	}
}

class CC{
	void c() {
		try {
			BB bb =new BB();
			bb.b();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class Errorprop {
	public static void main(String[] args) {
		CC cc = new CC();
		cc.c();
	}

}
