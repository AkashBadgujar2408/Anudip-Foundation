package abstraction.interfaces;
/*
 * Interfaces are template of a class. We use it to create a basic structure for the class.
 * 
 * Point to remember:-
 * 1) All methods in the interface are automatically considered as public and abstract, We do
 * not have to add the keywords public or abstract.
 * 
 * 2) All variables in the interface are automatically public static and final.
 * 
 * 3) Interface objects cannot be created.
 * 
 * 4) Interfaces do not have constructors. Constructors basically are used to create object
 * and to initialize the instance variable.
 * Since We cannot make the object of interface and We cannot initialize final variable through
 * constructor hence there is no requirement of constructors in interface. Therefore the
 * concept of constructors are not allowed.
 * 
 * 5) We use implements keyword to make an IS-A relationship between class and interface.
 * 
 * 6) Interface can never extend another class, it can extend another interface.
 * 
 * 7) A class can implement more than one interface.
 * 
 * 8) A class can do both - extend another class and implement many interfaces at the same time.
 * 
 * 9) We can make nested interfaces also.
 * 
 * 10) If in case a class does not want to implement all the methods of an interface then the class has to declare itself
 * as abstract.
 * 
 */
interface ClothingApp{
	String addToCart(String s);
	double coupon(String code);
}

class AjioApp implements ClothingApp{
	public String addToCart(String s) {
		return "Thank you for adding "+s+" in the cart...";
	}

	@Override
	public double coupon(String code) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class InterfacesDemo1 {
	public static void main(String[] args) {
		AjioApp a = new AjioApp();
		String msg = a.addToCart("Shoes");
		System.out.println(msg);
		
		System.out.println("Variable i in Demo2= "+Demo2.i); // proven that interface is public
	}
}
