package AbstractClassImplementsInterface;

interface racer{
	abstract void race();
	
}

abstract class Animal implements racer{
	void sleep() {
		System.out.println("slepping");
	}
	
	abstract void sound();
	
	
}

abstract class Pet extends Animal{
	abstract void type();
}

class Dog extends Pet{

	@Override
	public void race() {
		System.out.println("dog can race");
		
	}

	@Override
	void sound() {
		System.out.println("dog barks");
		
	}

	@Override
	void type() {
		System.out.println("dog is pet");
		
	}
	
}

class Cat extends Pet{

	
	@Override
	void sound() {
		System.out.println("cat meow");
		
	}

	@Override
	void type() {
		System.out.println("cat is pet");
	}

	@Override
	public void race() {
		System.out.println("cat can race");
		
	}
	
}

public class Main{
	public static void main(String[] args) {
		Pet a=new Dog();
		a.sleep();
		a.race();
		a.sound();
		a.type();
		
		System.out.println("--".repeat(25));
		a=new Cat();
		a.sleep();
		a.race();
		a.sound();
		a.type();
	}
}