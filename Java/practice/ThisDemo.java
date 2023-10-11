package practice;
/*
 * 10) Write a program to show the use of this keyword to differentiate between
 * local variable and instance variable.
 */
class withThis{
	int num;
	String str;
	char ch;
	boolean bool;
	public withThis(int num, String str, char ch, boolean bool) {
		/*
		 *  Here the left side variable are referring to instance variable which are assigned the values of
		 *  local variables which are on the right side.
		 */
		
		this.num = num;
		this.str = str;
		this.ch = ch;
		this.bool = bool;
	}
}

class withoutThis{
	int num;
	String str;
	char ch;
	boolean bool;
	public withoutThis(int num, String str, char ch, boolean bool) {
		/*
		 * Here both the sides are referring to the local variables only, therefore it will not change the
		 * values of instance variables. The output will return to the default values when instance variables
		 * are called.
		 */
		num = num;
		str = str;
		ch = ch;
		bool = bool;
	}
}

public class ThisDemo {
	public static void main(String[] args) {
		withThis thisDemo = new withThis(1,"Hello",'a',true);
		withoutThis notThisDemo = new withoutThis(1,"Hello",'a',true);
		System.out.println("With this:");
		System.out.println(thisDemo.num+" "+thisDemo.str+" "+thisDemo.ch+" "+thisDemo.bool);
		System.out.println("\nWithout this:");
		System.out.println(notThisDemo.num+" "+notThisDemo.str+" "+notThisDemo.ch+" "+notThisDemo.bool);
	}
}
