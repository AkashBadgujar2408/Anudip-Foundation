package StringPrograms;
/*
 * String immutability is the ability of Strings to not change the original object.
 * Once a String object is created in SCP memory then We will not be able to change this object.
 * If We try to concat or make any other change then a new String object is created.
 * 
 * We can refer this new String object by a new variable or use the same old reference to now point to
 * new Object.
 */
public class StringImmutability {
	public static void main(String[] args) {
		String name1 = "Akash";
		String name2 = "Akash";
		
		System.out.println("Are name1 and name2 referring to same object: "+(name1==name2));
		System.out.println("Before:\nname1= "+name1+"\nname2= "+name2);
		name1= name1.toUpperCase(); //same name1 variable will now refer to new object
		System.out.println("Are name1 and name2 referring to same object: "+(name1==name2));
		System.out.println("After:\nname1= "+name1+"\nname2= "+name2);
	}
}
