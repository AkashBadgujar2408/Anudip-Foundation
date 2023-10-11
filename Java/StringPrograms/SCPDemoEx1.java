package StringPrograms;
//SCP means "String Constant Pool"
public class SCPDemoEx1 {
	public static void main(String[] args) {
		/*
		 * s and t are created using literals. Hence both reference variables will point to the same object
		 * of Java in SCP Memory.
		 * For strings if We use == operator then JVM checks if two strings are located at same memory or not.
		 * Hence when We do s==t We get true.
		 * Whereas when We use new keyword then always a new object is created in heap memory.
		 * Therefore, a and b will point to two different objects in heap memory.
		 * Hence a==b will give false.
		 */
		String s = "Java";
		String t = "Java";
		
		String a = new String("Coding");
		String b = new String("Coding");
		
		System.out.println("Are s and t pointing to same object: "+(s==t));
		System.out.println("Are a and b pointing to same object: "+(a==b));
	}
}
