package que3;

class Outer{
	private int a=10;
	class Inner{
		void meth1() {
			System.out.println("inner the Innner class"+a);
		}
	}
}



public class Mainss {
public static void main(String[] args) {
	
	Outer outer = new Outer();
	Outer.Inner inner =outer.new Inner();
	inner.meth1();
	
}
}
