/**
 * 
 */
package behavioral.observer;

import java.util.Observable;

/**
 * Based on: "Patterns in Java", Mark Grand.
 * 
 * Date: Aug 16, 2011
 * 
 * @author moleksyuk
 */
public class DataStore extends Observable {

	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
		setChanged();
	}
}
