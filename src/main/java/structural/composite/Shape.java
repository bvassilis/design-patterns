package structural.composite;

public interface Shape {
	/**
	 * Draw shape on screen
	 * 
	 * Method that must be implemented by Basic as well as complex shapes
	 */
	public void renderShapeToScreen();

	/**
	 * Making a complex shape explode results in getting a list of the shapes
	 * forming this shape
	 * 
	 * For example if a rectangle explodes it results in 4 line objects
	 * 
	 * Making a simple shape explode results in returning the shape itself
	 */
	public Shape[] explodeShape();
}
