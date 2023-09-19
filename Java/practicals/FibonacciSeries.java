package practicals;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int count = 3;
		System.out.print(num1+" "+num2);
		
		while (count<=10) {
			int next = num1+num2;
			num1 = num2;
			num2 = next;
			System.out.print(" "+next);
			count++;
		}
	}
}
