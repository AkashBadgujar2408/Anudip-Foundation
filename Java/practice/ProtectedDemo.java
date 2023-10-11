package practice;

/*
 * 6) Write a program to demonstrate the use of protected method by making a
 *  parent class in one package and child class in other package.
 */
public class ProtectedDemo {
	public static void main(String[] args) {
		ProtectedChildDemo pc = new ProtectedChildDemo();
		pc.display();
	}
}
