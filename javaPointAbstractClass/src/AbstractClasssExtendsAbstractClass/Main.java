package AbstractClasssExtendsAbstractClass;

abstract class A{
	abstract void m1();
}

abstract class B extends A{
	abstract void m2();

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 in class B");
	}
	
}

class C extends B{

	@Override
	void m2() {
	
		System.out.println("m2 in clas C");
	}

	@Override
	void m1() {
	System.out.println("m1 in class C");
	}
	
}

public class Main{
	public static void main(String[] args) {
		B b;
		b=new C();
		
		b.m1();
		b.m2();
		
		
	}
}