package que5;

class A{
	void a() {
		final int a=10;
		class localInner{
			void Innermeth1() {
				System.out.println("local inner method"+a);
			}
		}
		localInner inner =new localInner();
		inner.Innermeth1();
		
	}
}



public class Main123 {
	public static void main(String[] args) {
		 A a =new A();
		 a.a();
		
	}

}
