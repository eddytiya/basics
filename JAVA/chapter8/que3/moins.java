package que3;


//Show an example of finally block
public class moins {
	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		
		
		try {
			int a=10/0;
		}catch(Exception E) {
			System.out.println(E+" "+E.getMessage());
		}
		finally {
			System.out.println("this will execute");
		}
	}
	}

