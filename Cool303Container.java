package JavaCool303;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Extends JPanel and implements Cool303Component.
 * Decorator for JPanel object. It does not have any background color and no border, no shape, but it may have title.
 * @author  Mia Wang(260559637), Zhening Zhang(260622324)
 *
 */
@SuppressWarnings("serial")
public class Cool303Container extends JPanel implements Cool303Component {
	
	/**
	 * Constructor for Cool303Container with theme and title
	 * @param theme Cool303Theme object.
	 * @param title	title of user's choice
	 */
	public Cool303Container(Cool303Theme theme, String title){
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(50,50,50,50), "Cool303Theme: "+theme.getName()+"---"+title,
				TitledBorder.LEFT, TitledBorder.ABOVE_TOP, new Font("Arial", Font.BOLD, 14), theme.getBgColor()));
	}
	
	/**
	 * Constructor for Cool303Container with theme only
	 * @param theme Cool303Theme object.
	 */
	public Cool303Container(Cool303Theme theme){
		setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
	}
}
