package StringPrograms;

public class StringEncrypter {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter a String to encrypt:");
		String str[] = scan.nextLine().split(" ");
		
		for (int i = str.length-1;i>=0;i--) {
			for (int j=0;j<str[i].length();j++) {
				System.out.print(str[i].charAt(j));
				if (j==str[i].length()-1) {
					System.out.print(" ");
				}
				if (str[i].charAt(j) != ' ') {
					int count = 1;
					for (int k=j+1;k<str[i].length();k++) {
						if (str[i].charAt(j) != str[i].charAt(k)) {
							break;
						}
						count++;
						str[i] = str[i].substring(0,k)+" "+str[i].substring(k+1);
						j++;
					}
					if (count>1) {
						System.out.print(count);
					}
				}
			}
		}
	}
}
