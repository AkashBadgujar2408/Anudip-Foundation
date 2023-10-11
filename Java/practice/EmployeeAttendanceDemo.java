package practice;

/*
 * 5) Write a program to change the behavior of Parent Employee class method
 * attendance() in Child JavaDeveloper.
 */
class Employee{
	public void attendance(){
		System.out.println("Employee's attendance is marked.");
	}
}
class JavaDeveloper extends Employee{
	public void attendance() {
		System.out.println("Java Developer's attendance is marked.");
	}
}
public class EmployeeAttendanceDemo {
	public static void main(String[] args) {
		JavaDeveloper javaDev = new JavaDeveloper();
		javaDev.attendance();
	}
}
