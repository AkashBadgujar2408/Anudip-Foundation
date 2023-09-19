package abstraction.interfaces;
/*
 * Create an interface for any app that you want.
 * 
 * Show its implementation in your class.
 * Also demonstrate the use of multiple inheritance in this example.
 */

interface Cover{
	public void CoverPage();
}
interface Pages{
	public void PageNo(int num);
}
class BookApp implements Cover, Pages{

	@Override
	public void PageNo(int num) {
		System.out.println("Page No. "+num);	
	}
	@Override
	public void CoverPage() {
		System.out.println("This is a cover page.");	
	}
	
}
public class InterfacePractice1 {
	public static void main(String[] args) {
		BookApp book = new BookApp();
		book.PageNo(5);
		book.CoverPage();
	}
}
