package ObjectInitializationThroughReferenceVariable;
class Student{
	int id;
	String name;
	
}


public class Main{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.id=1;
		s1.name="mahesh";
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		Student s2=new Student();
		s2.id=2;
		s2.name="vaibhav";
		
		System.out.println(s2.id);
		System.out.println(s2.name);
		
		
		
		
	}
}