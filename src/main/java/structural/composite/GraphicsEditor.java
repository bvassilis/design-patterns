package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GraphicsEditor {
	public static void main(String[] args) {

		List<Shape> allShapesInSoftware = new ArrayList<Shape>();

		// create a line shape
		Shape lineShape = new Line(0, 0, 1, 1);

		// add it to the shapes
		allShapesInSoftware.add(lineShape);

		// create a rectangle shape
		Shape rectangelShape = new Rectangle();

		// add it to shapes

		allShapesInSoftware.add(rectangelShape);

		// create a complex shape
		// note that we have dealt with the complex shape
		// not with shape interface because we want
		// to do a specific operation
		// that does not apply to all shapes
		ComplexShape complexShape = new ComplexShape();

		// complex shape is made of the rectangle and the line

		complexShape.addToShape(rectangelShape);

		complexShape.addToShape(lineShape);

		// add to shapes

		allShapesInSoftware.add(complexShape);

		// create a more complex shape which is made of the
		// previously created complex shape
		// as well as a line

		ComplexShape veryComplexShape = new ComplexShape();

		veryComplexShape.addToShape(complexShape);

		veryComplexShape.addToShape(lineShape);

		allShapesInSoftware.add(veryComplexShape);

		renderGraphics(allShapesInSoftware);

		// you can explode any object
		// despite the fact that the shape might be
		// simple or complex

		Shape[] arrayOfShapes = allShapesInSoftware.get(0).explodeShape();

	}

	private static void renderGraphics(List<Shape> shapesToRender) {

		// note that despite the fact there are
		// simple and complex shapes
		// this method deals with them uniformly
		// and using the Shape interface

		for (Shape s : shapesToRender) {
			s.renderShapeToScreen();
		}

	}
}