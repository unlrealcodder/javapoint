package SingleInheritance;
class Animal{
	void eat() {
		System.out.println("animal can eat");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("dog can bark");
	}
}
public class Main{
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.eat();
		d1.bark();
	}
}