package RunTimePolymorphism;
class Bank{
	void rateOfInterest() {
		System.out.println("rate of interest of reserve is ");
	}
}

class SbiBank extends Bank{

	@Override
	void rateOfInterest() {
		System.out.println("sbi interest");
	}
	
}

class AxisBank extends Bank{

	@Override
	void rateOfInterest() {
		System.out.println("axis interest");
	}
	
}

class HdfcBank extends Bank{

	@Override
	void rateOfInterest() {
		System.out.println("hdfc interest");
	}
	
}

public class Main{
	public static void main(String[] args) {
		Bank b =new Bank();
		b.rateOfInterest();
		
	    b=new SbiBank();  // up casting
		b.rateOfInterest();
		
		b=new AxisBank();
		b.rateOfInterest();
		
		b=new HdfcBank();
		b.rateOfInterest();
	}
}