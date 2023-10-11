package StringPrograms;

public class StringBufferEx1 {
	/*
	 * If We want to create the mutable object of character sequence then We should use StringBuffer
	 * or StringBuilder.
	 * 
	 * These are classes that create mutable String objects.
	 * 
	 * Concatenation is the process of adding words or character to an existing String.
	 * 
	 * StringBuffer and StringBuilder classes are both used to create mutable String objects.
	 * The only difference between the two is that the StringBuffer is thread-safe whereas StringBuilder
	 * is NOT thread-safe.
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Anudip"); //This is a mutable object.
		String s = "Anudip";
		
		System.out.println("Before:");
		System.out.println("s= "+s+"\nsb= "+sb);
		
		s.concat(" Foundation");
		sb.append(" Foundation");
		
		System.out.println("After:");
		System.out.println("s= "+s+"\nsb= "+sb);
	}
}
