package structural.flyweight;

public class SoldierImp implements Soldier {
	/**
	 * Intrinsic State maintained by flyweight implementation
	 * Solider Shape ( graphical represetation)
	 * how to display the soldier is up to the flyweight implementation
	 */
	private Object soldierGraphicalRepresentation;

	/**
	 * Note that this method accepts soldier location 
	 * Soldier Location is Extrinsic and no reference to previous location 
	 * or new location is maintained inside the flyweight implementation
	 */
	public void moveSoldier(int previousLocationX, int previousLocationY,
			int newLocationX, int newLocationY) {

		// delete soldier representation from previous location 
		// then render soldier representation in new location 	
	}
}
