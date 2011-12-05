/**
 * 
 */
package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Based on: "Patterns in Java", Mark Grand.
 * 
 * Date: Aug 16, 2011
 * 
 * @author moleksyuk
 */
public class Screen implements Observer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof DataStore) {
			System.out.println("New value: " + ((DataStore) obs).getData());
		}
	}
}
