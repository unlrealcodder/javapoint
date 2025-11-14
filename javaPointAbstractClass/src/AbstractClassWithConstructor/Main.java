package AbstractClassWithConstructor;
abstract class Shape{

	Shape() {
		System.out.println("shape created");
	}
	
	abstract void draw();
	
	void check() {
		System.out.println("shape checking");
	}
}

class Rectangle extends Shape{

	Rectangle(){
		System.out.println("rectangle created");
	}
	
	@Override
	void draw() {
		System.out.println("rectangle is draw");
		
	}

	@Override
	void check() {
		// TODO Auto-generated method stub
		System.out.println("rectangle checking");
	}
	
	
	
}

class Circle extends Shape{

	Circle(){
		System.out.println("circle created");
	}
	@Override
	void draw() {
		System.out.println("circle is drawing");
		
	}

	@Override
	void check() {
		// TODO Auto-generated method stub
		System.out.println("circle checking");
	}
	
	
	
}

public class Main{
	public static void main(String[] args) {
		Shape s;
		
		s=new Rectangle();
		s.draw();
		s.check();
		
		System.out.println("--".repeat(25));
		
		s=new Circle();
		s.draw();
		s.check();
		
		System.out.println("--".repeat(25));
		
		Rectangle r=new Rectangle();
		
		System.out.println("--".repeat(25));
		Circle c=new Circle();
		
	}
}