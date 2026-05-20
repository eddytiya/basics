package q2;
class MG{
	MG details() {
		System.out.println("this is a 4 seater car");
		return this;
	}
}

class TATA extends MG{
	TATA details() {
		System.out.println("this is a TATA 4 seater car");
		return this;
	}
	
	void owner() {
		System.out.println("ratan tata");
	}
}
public class RTE {
	public static void main(String[] args) {
		TATA tata = new TATA();
		tata.details().owner();
	}

}
