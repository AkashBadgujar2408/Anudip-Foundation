package assignment3;

import java.util.Scanner;
//6) Take two inputs. Eg 3 and 4. 
//Find the value of 3^4 i.e. 3 raised to 4. You cannot use Math.pow() method.
class Power{
	int findPower(int base,int power) {
		int num = 1;
		for (int i=1;i<=power;i++) {
			num = base*num;
		}
		return num;
	}
}

public class PowerApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base:");
		int base = scan.nextInt();
		System.out.println("Enter the power:");
		int power = scan.nextInt();
		Power pow = new Power();
		int res = pow.findPower(base, power);
		System.out.println(base+"^"+power+" = "+res);
	}
}
