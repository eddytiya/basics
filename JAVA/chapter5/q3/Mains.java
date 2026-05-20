package q3;
//dynamic method dispatch

class RBI{
	float rateOfInterest() {
		return 0.0f;
	}
}

class ICICI extends RBI {
	float rateOfInterest() {
		return 9.3f;
	}
}
class HDFC extends RBI {
	float rateOfInterest() {
		return 8.1f;
	}
}

class SBI extends RBI{
	float rateOfInterest() {
		return 7.3f;
		
	}
}

public class Mains {
	public static void main(String[] args) {
		RBI r;
		r=new ICICI();
		System.out.println(r.rateOfInterest());
		
		r=new HDFC();
		System.out.println(r.rateOfInterest());
	}

}
