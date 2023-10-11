package StringPrograms;

public class Exercise8 {
	public static void main(String[] args) {
		/*
		 * Write a program to count the number of words in the given String.
		 */
		String message="Hi everyone! Weekend is here!!";
		String msg[] = message.split(" ");
		System.out.println("Number of words in message: "+msg.length);
		
	}
}
