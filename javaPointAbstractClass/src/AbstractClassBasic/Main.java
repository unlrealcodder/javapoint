package AbstractClassBasic;
abstract class Bike{
	void startEngine() {
		System.out.println("engine started");
	}
	abstract void run();
}

class hondaBike extends Bike{

	@Override
	void run() {
		System.out.println("honda running");
		
	}
	
}

class heroBike extends Bike{

	@Override
	void run() {
		System.out.println("heroBike is running");
		
	}
	
}

public class Main{
	public static void main(String[] args) {
		Bike b;
    System.out.println("--".repeat(25));
	System.out.println("for honda bike");
	System.out.println("--".repeat(25));
	b=new hondaBike();
	b.startEngine();
	b.run();
	
	System.out.println("--".repeat(25));
	System.out.println("for hero bike");
	System.out.println("--".repeat(25));
	
	b=new heroBike();
	b.startEngine();
	b.run();
	}
}