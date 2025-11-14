package StaticMethodInAbstractClass;
abstract class Animal{
	static void  method1() {
		System.out.println("method1 in class animal");
	}
}

class Dog extends Animal{
	static void  method1() {
		System.out.println("method1 in class dog");
	}
}

class Cat extends Animal{
	static void  method1() {
		System.out.println("method1 in class cat");
	}
}

public class Main{
	public static void main(String[] args) {
		Animal.method1();
		
		Dog.method1();
		
		Cat.method1();
	}
}