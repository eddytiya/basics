package q3_a;

public class A {
	
	public int a=10;
	private int b=20;
	protected int c=30;
	int d=40;//default
	
public static void main(String[] args) {
	
	A a = new A();
	System.out.println(a.a);//public
	System.out.println(a.b);//private
	System.out.println(a.c);//protected
	System.out.println(a.d);//default
	
}
}

class B{
public static void main(String[] args) {
	A a = new A();
	System.out.println(a.a);//public
	//System.out.println(a.b);//private(cannot be accessed outside the class)
	System.out.println(a.c);//protected
	System.out.println(a.d);//default
	
}
}

class C extends A{
	
	public static void main(String[] args) {

		C c =new C();
		System.out.println(c.a);//public
		//System.out.println(c.b);//private
		System.out.println(c.c);//protected
		System.out.println(c.d);//default
	}
	
}
	

