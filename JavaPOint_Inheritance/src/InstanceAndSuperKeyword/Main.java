package InstanceAndSuperKeyword;

class A{
	int i=10;
	void dsiplay() {
		System.out.println("class A:"+i);
	}
}

class B extends A{
	int i=20;
	void display() {
		super.dsiplay();
		System.out.println("clas B:"+i);
	}
}
public class Main{
	public static void main(String[] args) {
		B obj=new B();
		obj.display();
	}
}