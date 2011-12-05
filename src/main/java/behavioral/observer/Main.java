/**
 * 
 */
package behavioral.observer;

/**
 * Based on: "Patterns in Java", Mark Grand.
 * 
 * Date: Aug 16, 2011
 * 
 * @author moleksyuk
 */
public class Main {

	public static void main(String[] args) {
		Screen screen = new Screen();
		DataStore ds = new DataStore();
		ds.addObserver(screen);
		ds.setData("Some data");
		ds.notifyObservers();
	}
}
