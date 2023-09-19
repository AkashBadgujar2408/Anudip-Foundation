package classAndObjects;

public class typeCastingApp {
	public static void main(String[] args) {
		long data = 31457462l;
		int convNum = converter(data);
		System.out.println(convNum);
	}
	public static int converter(long num) {
		return (int)(num);
	}
}
