package structural.flyweight;

public class SoldierClient {
	/**
	 * Reference to the flyweight
	 */
	private Soldier soldier = SoldierFactory.getSoldier();
	
	/**
	 * this state is maintained by the client 
	 */
	private int currentLocationX = 0;
	
	/**
	 * this state is maintained by the client 
	 */
	private int currentLocationY=0;
	
	
	public void moveSoldier(int newLocationX, int newLocationY){

		// here the actual rendering is handled by the flyweight object 
		soldier.moveSoldier(currentLocationX, 
			currentLocationY, newLocationX, newLocationY);
		
		// this object is responsible for maintaining the state
		// that is extrinsic to the flyweight
		currentLocationX = newLocationX;
		
		currentLocationY = newLocationY;
	}
}
