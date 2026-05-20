package que2;

import java.io.IOException;

class X{
	void x() throws IOException{
		IOException exception = new IOException();
		throw exception;
	}
	
}

class Y{
	void y() throws IOException{
		X x = new X();
		x.x();
	}
}

class Z{
	void z() {
		try {
			Y y = new Y();
			y.y();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


public class Moinss {
	public static void main(String[] args) {
		Z z =new Z();
		z.z();
	}

}
