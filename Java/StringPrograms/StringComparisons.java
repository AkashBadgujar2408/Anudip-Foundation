package StringPrograms;

public class StringComparisons {
	public static void main(String[] args) {
		String s1 = "Dhananjay";
		String s2 = "Dhananjay";
		String s3 = "Dhananjay Pawar";
		
		System.out.println("s1 equals s2? "+s1.equals(s2));
		System.out.println("s1 equals s3? "+s1.equals(s3));
		
		int i = s1.compareTo(s2);
		int j = s1.compareTo(s3);

		if(i==0) {
			System.out.println("s1 is exactly same as s2");
		} else {
			System.out.println("s1 and s2 are different");
		}
		if (j==0) {
			System.out.println("s1 is exactly same as s3");
		} else {
			System.out.println("s1 and s3 are different");
		}
	}
}
