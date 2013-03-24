package structural.adapter;

public class LegacyLine implements Pi{
	public void drawPi(int x1, int y1, int x2, int y2) {
		System.out.println("line from (" + x1 + ',' + y1 + ") to (" + x2 + ',' + y2 + ')');
	}
}
