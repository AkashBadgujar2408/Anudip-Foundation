package assignment3;
//7) Write a program to find whether a given year is a leap year or not.
import java.util.Scanner;

class Leap{
	void checkLeapYear(int year) {
		if (year%400==0) {
			System.out.println(year+" is a leap year.");
		}
		else if ((year%4==0 && (year%100!=0))){
			System.out.println(year+" is a leap year.");
		}
		else {
			System.out.println(year+" is not a leap year.");
		}
	}
}

public class LeapYearApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year to check if it is leap year or not:");
		int year = scan.nextInt();
		Leap lp = new Leap();
		lp.checkLeapYear(year);
	}
}
