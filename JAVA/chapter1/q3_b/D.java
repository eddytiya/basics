package q3_b;

import q3_a.A;

public class D {
public static void main(String[] args) {
	
	A a = new A();
	System.out.println(a.a);//public
	//System.out.println(a.b);//private
	//System.out.println(a.c);//protected
	//System.out.println(a.d);//default
}


}


class E extends A{
	public static void main(String[] args) {
		E a= new E();
		System.out.println(a.a);//public
//		System.out.println(a.b);//private
		System.out.println(a.c);//protected
		//System.out.println(a.d);//default
	}
}
