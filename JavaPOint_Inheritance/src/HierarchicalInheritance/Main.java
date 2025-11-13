package HierarchicalInheritance;
class Animal{
	void eat() {
		System.out.println("eat");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("bark");
	}
}

class Cat extends Animal{
	void meow() {
		System.out.println("meow");
	}
}


public class Main{
	public static void main(String[] args) {
		System.out.println("using dog object");
		Dog d=new Dog();
		d.eat();
		d.bark();
		
		System.out.println("using cat object");
		Cat c=new Cat();
		c.eat();
		c.meow();
		
		
	}
}