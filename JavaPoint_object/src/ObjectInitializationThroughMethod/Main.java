package ObjectInitializationThroughMethod;
class Student{
	int id;
	String name;
	
	void insertvalue(int a,String b) {
		id=a;
		name=b;
	}
	
	void displayValue() {
		System.out.println(id);
		System.out.println(name);
	}
}

public class Main{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.insertvalue(1, "mahesh");
		s1.displayValue();
		
		Student s2=new Student();
		s2.insertvalue(2, "vaibhav");
		s2.displayValue();
		
		
	}
}