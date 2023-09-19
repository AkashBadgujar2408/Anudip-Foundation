package assignment3;
//10) Write a program switch for taking a user input
//for an icecream flavour and print the cost of that icecream.
import java.util.Scanner;

public class IceCreamApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the flavour: chocolate, vanilla, strawberry, butterscotch -");
		String str = scan.next();
		switch (str) {
		case "chocolate": System.out.println("Cost of chocolate icecream is Rs. 15/-");
						  break;
		case "vanilla": System.out.println("Cost of vanilla icecream is Rs. 12/-");
		  				  break;
		case "strawberry": System.out.println("Cost of strawberry icecream is Rs. 10/-");
		  				  break;
		case "butterscotch": System.out.println("Cost of butterscotch icecream is Rs. 18/-");
		  				  break;
		default: System.out.println("This flavour of icecream is not available.");
		}
	}
}
