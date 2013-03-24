package structural.adapter;

public class LegacyRectangle implements Pi {
	public void drawPi(int x, int y, int w, int h) {
		System.out.println("rectangle at (" + x + ',' + y + ") with width " + w + " and height " + h);
	}
}
