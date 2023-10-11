package abstraction.interfaces;

interface MyInter{
	
	public void display();
	public void show();
}

/*
 * In below given MyClass We have not given method body/implementation to the show method.
 * Meaning the show method inherited from MyInter is being kept as it is and would be abstract.
 * 
 * We already know that any class having abstract method has to be declared as abstract, therefore We will have to make
 * MyClass also abstract.
 */
abstract class MyClass implements MyInter{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo6 {

}
