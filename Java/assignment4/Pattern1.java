package assignment4;
/*
10101
01010
10101
01010
10101
 */
public class Pattern1 {
	public static void main(String[] args) {
		for (int i=1;i<=5;i++){
			for (int j=1;j<=5;j++) {
				if (i%2==0) {
					if (j%2==0) {
						System.out.print(1);
					}
					else {
						System.out.print(0);
					}
				}
				else {
					System.out.print(j%2);
				}
			}
			System.out.println();
		}
	}
}
