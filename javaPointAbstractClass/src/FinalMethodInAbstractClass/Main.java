package FinalMethodInAbstractClass;

abstract class Animal{
	final void sleep() {
		System.out.println("sleeping ");
	}
	
	abstract void sound();
}

class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("dog barks");
		
	}
	
	
	
}

class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("cat meow");
		
	}
	
	 
	
}

public class Main{
	public static void main(String[] args) {
		Animal a=new Dog();
		a.sleep();
		a.sound();
		
		a=new Cat();
		a.sleep();
		a.sound();
	}
}