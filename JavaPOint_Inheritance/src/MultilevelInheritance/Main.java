package MultilevelInheritance;
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

class BabbyDog extends Dog{
	void weep() {
		System.out.println("weep");
	}
}

public class Main{
	public static void main(String[] args) {
		BabbyDog b1=new BabbyDog();
		b1.eat();
		b1.bark();
		b1.weep();
	}
}