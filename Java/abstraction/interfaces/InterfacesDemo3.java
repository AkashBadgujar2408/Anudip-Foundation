package abstraction.interfaces;

interface Template1{
	public void display();
}

class Programmer{
	public void coding() {
		System.out.println("Programmer is coding.....");
	}
}
/*
 * Below We can see that We can make another interface as the parent of the Template2 interface.
 * But We will not be ale to make a class as the parent of our Template2 interface.
 */
interface Template2 extends Template1{
	public void show();
}

public class InterfacesDemo3 {

}
