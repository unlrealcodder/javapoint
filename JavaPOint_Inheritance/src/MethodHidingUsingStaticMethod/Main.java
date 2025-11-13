package MethodHidingUsingStaticMethod;

class Parent{
	static void parentMethod() {
		System.out.println("parent method");
	}
}

class Child extends Parent{
	static void childMethod() {
		System.out.println("child method");
	}
}
public class Main{
	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.parentMethod();
		
		Child c=new Child();
		c.childMethod();
		
		Parent pc=new Child();
		pc.parentMethod();
		
		
	}
}