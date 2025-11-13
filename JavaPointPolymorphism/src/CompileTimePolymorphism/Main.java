package CompileTimePolymorphism;
class Calculation{
	  int add(int a,int b) {
		return a+b;
	}
	
	
	double add(double a,double b) {
		return a+b;
	}
	
	double add(int a,float b) {
		return a+b;
	}
	
}
public class Main{
	public static void main(String[] args) {
		Calculation c=new Calculation();
		System.out.println("for integer");
		System.out.println(c.add(10, 20));
		
		System.out.println("for double");
		System.out.println(c.add(10.5, 10.2));
		
		System.out.println("for mix");
		double result=(c.add(12, 10.5));
		System.out.println(result);
		
		
	}
}
