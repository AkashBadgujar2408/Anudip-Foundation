package practicals;

public class WhilePractice1 {
	public static void main(String[] args) {
		/*
		 * Write a program to find the total of the first 10 whole numbers.
		 */
		int num = 1;
		int sum = 0;
		while (num<=10) {
			sum = sum+num;
			num++;
		}
		System.out.println(sum);
	}
}
