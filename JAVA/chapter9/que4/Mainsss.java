package que4;

import que4.Outer.Inner;

class Outer {
	static private int a =10;
	static class Inner{
		
		void meth1() {
			System.out.println("this is not static method"+a);
		}
		 static void meth2() {
			System.out.println("this is a static method"+a);
		}
		
	}
}


public class Mainsss {
public static void main(String[] args) {
	Outer outer = new Outer();
	
	Outer.Inner inner= new Outer.Inner();
	
	inner.meth1();
	Inner.meth2();
}
}
