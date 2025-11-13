package FieldHidingInRuntimePolymorphsm;
class Bike{
	int speedLimit=90;
	void run() {
		System.out.println("bike runs");
	}
}

class HondaBike extends Bike{
	int speedLimit=110;

	@Override
	void run() {
		System.out.println("hero honda runs");
	}
	
}
public class Main{
	public static void main(String[] args) {
		System.out.println("for bike");
		Bike b=new Bike();
		System.out.println(b.speedLimit);
		b.run();
		System.out.println("--".repeat(20));
		System.out.println("for hondabike");
		b=new HondaBike();
		System.out.println(b.speedLimit);
		b.run();
	}
}

// gives output 90 
// speedLimit hidden not overridden