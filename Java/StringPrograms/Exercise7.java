package StringPrograms;

public class Exercise7 {
	public static void main(String[] args) {
		/*
		 * Write a program to print all the indexes at which occurs.
		 */
		String s = "Yellow Umbrella";
		// Method 1
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)=='l') {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		// Method 2
		for (int i=0;i<s.length();i++) {
			int j = s.indexOf('l',i);
			if (j!=-1) {
				System.out.print(j+" ");
				i=j;
			}
		}
	}
}
