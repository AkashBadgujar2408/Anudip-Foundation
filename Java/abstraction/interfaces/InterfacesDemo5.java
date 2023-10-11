package abstraction.interfaces;

interface Hotel{
	
	public void dining();
	public void buffet();
	
	/*
	 * Below We are seeing the nested interface. Meaning an interface which is inside another interface.
	 */
	interface Banquet{
		
		public void weddingDecoration();
		public void partyDecoration();
	}
}

class HotelRamoBharose implements Hotel{

	@Override
	public void dining() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buffet() {
		// TODO Auto-generated method stub
		
	}
}
class SunAndSand implements Hotel, Hotel.Banquet{

	@Override
	public void weddingDecoration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void partyDecoration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dining() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buffet() {
		// TODO Auto-generated method stub
		
	}
}

public class InterfacesDemo5 {

}
