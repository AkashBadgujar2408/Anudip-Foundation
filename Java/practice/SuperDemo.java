package practice;

/*
 * 8) Write a program to demonstrate the use of super keyword.
 */

class Student extends Object{
	String name = "Default Name";
	int rollNo = 00;
	int percentage = 100;
	
	public Student(String name, int rollNo, int percentage) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.percentage = percentage;
	}
}
class JavaStudent extends Student{
	public JavaStudent(String name, int rollNo, int percentage) {
		super(name, rollNo, percentage);
	}

	@Override
	public String toString() {
		return name+" "+rollNo+" "+percentage;
	}
	
}
public class SuperDemo {
	public static void main(String[] args) {
		JavaStudent javaSt = new JavaStudent("Akash",01,84);
		System.out.println(javaSt);
	}
}
