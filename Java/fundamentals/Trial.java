package fundamentals;

class Stud{
	static String name = "Akash";
	
	public void display() {
		System.out.println(name);
	}
}
public class Trial {
	public static void main(String[] args) {
		System.out.println(Stud.name);
		Stud s = new Stud();
		s.display();
		System.out.println(s.name);
		s.name = "Badgujar";
		System.out.println(s.name);
		s.display();
		System.out.println(Stud.name);
		Stud.name = "Golu";
		System.out.println(s.name);
		Stud s2 = new Stud();
		System.out.println(s2.name);
	}
}
