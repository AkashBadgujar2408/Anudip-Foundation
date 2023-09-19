package abstraction.interfaces;

/*
 * Below We are seeing that the variables are automatically considered public static and
 * final, we don't have to use the specific keywords to make them so.
 */
interface Demo2{
	int i = 5;
	String name = "Anudip Foundation";
	
//	public Demo2() {
//		
//	}
}

public class InterfacesDemo2 {
	public static void main(String[] args) {
		System.out.println("i= "+Demo2.i); /* proven that interface is static as the instance 
										      of object is not needed to be created */
		// Demo2.i = 20; proven that interface is final as We are unable to change value
		
		/*
		 * As seen below We will never be able to create the object of an interface
		 * Demo2 d = new Demo2();
		 */
	}
}
