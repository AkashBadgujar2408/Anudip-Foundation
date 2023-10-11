package fundamentals;
/*
 * Static members are same copy for all objects where as instance variables have separate copy in
 * separate objects.
 * Any changes made in the value of instance variable in one object will not affect the value of
 * the instance variable in other objects.
 */
class Student{
	static String college = "Bhavan's College";
	String student = "Mohini";
}
public class StaticDemo1 {
	public static void main(String[] args) {
		System.out.println("College name= "+Student.college);
		Student s = new Student();
		Student t = new Student();
		
		System.out.println("\n*****Before*****");
		System.out.println("Values in the student object s...");
		System.out.println("College name= "+Student.college);
		System.out.println("Student name= "+s.student);
		
		
		System.out.println("\n*****After*****");
		System.out.println("Values in the student object t...");
		System.out.println("College name= "+Student.college);
		System.out.println("Student name= "+t.student);
		
		Student.college = "JRD Tata's College";
		t.student = "Anjali";
		
		/*
		 * Below We can see that We change the static college name. The change is visible.
		 */
		System.out.println("\n\n*****After changing name in student object t*****");
		System.out.println("\n*****Before*****");
		System.out.println("Values in the student object s...");
		System.out.println("College name= "+Student.college);
		System.out.println("Student name= "+s.student);

		System.out.println("\n*****After*****");
		System.out.println("Values in the student object t...");
		System.out.println("College name= "+Student.college);
		System.out.println("Student name= "+t.student);
	}
}
