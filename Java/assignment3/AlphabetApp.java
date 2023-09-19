package assignment3;

import java.util.Scanner;
//9) Write a program to input any alphabet and check whether it is vowel or consonant.
class Alphabet{
	void checkAlphabet(char alpha) {
		switch (alpha) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println(alpha+" is vowel.");
			break;
		default:
			System.out.println(alpha+" is consonant.");
		}
	}
}

public class AlphabetApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char alpha = scan.next().charAt(0);
		Alphabet al = new Alphabet();
		al.checkAlphabet(alpha);
	}
}
