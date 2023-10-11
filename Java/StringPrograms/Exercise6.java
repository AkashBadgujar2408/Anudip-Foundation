package StringPrograms;
import java.util.Scanner;
public class Exercise6 {
	/*
	 * Write a program to take user input of any word.
	 * Example:-
	 * String s = "Anudip"
	 * Print pattern as follows -
	 * 
	 * pidunA
	 * pidun
	 * pidu
	 * pid
	 * pi
	 * p
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word to generate pattern:");
		String str = scan.next();
		for (int i=0;i<str.length();i++) {
			for (int j=str.length()-1;j>=i;j--) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
}
