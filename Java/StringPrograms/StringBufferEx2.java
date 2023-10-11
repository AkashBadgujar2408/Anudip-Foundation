package StringPrograms;

public class StringBufferEx2 {
	public static void main(String[] args) {
		//Reversing the String using StringBuffer
		StringBuffer sb = new StringBuffer("Anudip Foundation");
		sb.reverse();
		System.out.println(sb);
		
		//Replacing the content of String using StringBuffer
		StringBuffer sb2 = new StringBuffer("Indian Cricket Team");
		/*
		 * In the StringBuffer/StringBuilder class the replace method is used to replace the characters from
		 * start index upto the end index with new characters
		 */
		sb2.replace(7,14,"Hockey");
		System.out.println(sb2);
		sb2.delete(0, 6);
		System.out.println(sb2);
	}
}
