package StringPrograms;

public class Exercise9 {
	public static void main(String[] args) {
		String str = "Happy birthday";
		/*
		 * Write a program to remove all the duplicate letter of the given String.
		 */
		char[] chArr = str.toCharArray();
		
		for (int i=0;i<chArr.length;i++) {
			if (chArr[i]!=' ') {
				for (int j=i+1;j<chArr.length;j++) {
					if (chArr[i] == chArr[j]) {
						chArr[j] = ' ';
					}
				}
				System.out.print(chArr[i]+" ");
			}
		}
	}
}
