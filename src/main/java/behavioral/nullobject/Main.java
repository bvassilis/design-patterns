package behavioral.nullobject;

/**
 * Based on: "Patterns in Java", Mark Grand.
 * 
 * Date: Aug 8, 2011
 * 
 * @author moleksyuk
 */
public class Main {

	public static void main(String[] args) {
		IWarningRouter router1 = new WarningDialog();
		router1.routeWarning("Some message!");

		IWarningRouter router2 = new IgnoreWarning();
		router2.routeWarning("Nothing to happed!");
	}

}
