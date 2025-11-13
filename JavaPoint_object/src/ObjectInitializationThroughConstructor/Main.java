package ObjectInitializationThroughConstructor;
class Student{
	int id;
	String name;
	
	Student(int a,String b){
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
		Student s1=new Student(1,"mahesh");
		s1.displayValue();
		
		Student s2=new Student(3,"pradnya");
		s2.displayValue();
	}
}