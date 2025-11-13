package HybridInheritance;
class A{

	void functionA() {
		System.out.println("A");
	}
	
}


class B extends A{
	void functionB() {
		System.out.println("B");
	}
}

class C extends A{
	void functionC() {
		System.out.println("C");
	}
}

class D extends B{
	void functionD() {
		System.out.println("D");
	}
}

class E extends C{
	void functionE() {
		System.out.println("E");
	}
}


public class Main{
	public static void main(String[] args) {
		System.out.println("==".repeat(50));
		B objB=new B();
		objB.functionA();
		objB.functionB();
		
		System.out.println("==".repeat(50));
		C objC=new C();
		objC.functionA();
		objC.functionC();
		
		System.out.println("==".repeat(50));
		D objD=new D();
		objD.functionA();
		objD.functionB();
		objD.functionD();
		
		System.out.println("==".repeat(50));
		E objE=new E();
		objE.functionA();
		objE.functionC();
		objE.functionE();
	}
}