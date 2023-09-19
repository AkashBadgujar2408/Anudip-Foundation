package fundamentals;

public class ParametersDemo3 {
	public void display(String a, int b) {
		System.out.println("String input: "+a);
		System.out.println("int inpt: "+b);
	}
	public static void main(String[] args) {
		ParametersDemo3 pd3 = new ParametersDemo3();
		pd3.display("Sanket",90);
	}
}
