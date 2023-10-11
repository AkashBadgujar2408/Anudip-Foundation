package abstraction.interfaces;

interface Camera{
	public void clickPic();
}
interface PhoneCalls{
	public void calling();
}

class Landline implements PhoneCalls{
	public void calling() {
		System.out.println("Calling contact through landline");
	}
}

class CandyCrushGame{
	public void increasePoints() {
		System.out.println("Points increased on three match...");
	}
	public void backgroundMusic() {
		System.out.println("Background music is playing...");
	}
	public void graphics() {
		System.out.println("Graphics of the game is changing according to stages of game...");
	}
}
/*
 * Below We have implemented two different interfaces with the class Mobile.
 * Meaning We have made two interfaces as the parents of Mobile class.
 * Hence multiple inheritance in Java is allowed with interfaces.
 * But We cannot do multiple inheritance with classes, meaning We cannot make more than one class as parent.
 * 
 * We are also seeing that We can extend one class and implement many interfaces at the same time.
 * Remember We should always extend first and implement later.
 */

class Mobile extends CandyCrushGame implements Camera, PhoneCalls{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickPic() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfacesDemo4 {

}
