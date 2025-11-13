package Inheritance;

class Employee{
	float salary=40000;
}

class Programmer extends Employee{
	float bonus =10000;
}
public class Main{
	public static void main(String[] args) {
		Programmer p1=new Programmer();
		System.out.println(" bonus is: "+p1.bonus);
		System.out.println(" salary is: "+p1.salary);
	}
}