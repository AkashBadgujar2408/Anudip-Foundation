package practice;

/*
 * 2) Write a program to demonstrate the hierarchical inheritance.
 * Show with example how the parent method is inherited by all child classes.
 */
class Parent{
	public void display() {
		System.out.println("This is a method from the parent class inherited to "+this);
	}
}
class Child1 extends Parent{
	
}
class Child2 extends Parent{
	
}
class Child3 extends Parent{
	
}
public class HierarchicalInheritanceDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		Child3 c3 = new Child3();
		p.display();
		c1.display();
		c2.display();
		c3.display();
	}
}
