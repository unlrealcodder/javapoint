package CallingMethodUsingAnonymousObject;
class Student{
	int id;
	String name;
	
	void displayValue(int a, String b) {
		id=a;
		name=b;
		System.out.println(id);
		System.out.println(name);
	}
}
public class Main{
	
	void fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	
	
	
	public static void main(String[] args) {
		new Main().fact(5);
		
		new Student().displayValue(2, "raj");
		
		Student s1=new Student();
		System.out.println(s1);
	}
}