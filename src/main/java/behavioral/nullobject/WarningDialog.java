package behavioral.nullobject;

import javax.swing.JOptionPane;

/**
 * Based on: "Patterns in Java", Mark Grand.
 * 
 * Date: Aug 8, 2011
 * 
 * @author moleksyuk
 */
public class WarningDialog implements IWarningRouter {

	@Override
	public boolean routeWarning(String message) {
		int result = JOptionPane.showConfirmDialog(null, message, "Warning",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
		return result == 0;
	}

}
