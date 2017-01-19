package JavaCool303;


import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
/**
 * Extends JButton class and implements Cool303Component class.
 * Decorator for JButton object.
 * @author Mia Wang(260559637), Zhening Zhang(260622324)
 *
 */
@SuppressWarnings("serial")
public class Cool303Button extends JButton implements Cool303Component{
	private Cool303Theme theme;
	private int index;
	
	/**
	 * Constructor for Cool303Button, theme as user input, with index on each button.
	 * @param theme	Cool303Theme object.
	 * @param index integer number for each button
	 */
	public Cool303Button(Cool303Theme theme, int index){
		this.theme = theme;
		this.index = index;
		this.setText(""+index);
	}
	
	/**
	 * Constructor for Cool303Button, theme as user input, with any text on each button, index is default 0.
	 * @param theme Cool303Theme object.
	 * @param text	any text needs to be shown on button
	 */
	//overload
	public Cool303Button(Cool303Theme theme, String text){
		this.theme = theme;
		this.index = 0;
		this.setText(text);
	}
	
	/**
	 * Getter method for getting button index.
	 * @return index number.
	 */
	public int getIndex(){
		return index;
	}
	
	/**
	 * {@inheritDoc} set button color, text color, button shape, button border color.
	 */
	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2d = this.theme.setButton(g, this);
		this.setForeground(this.theme.getTextColor());
		super.paintComponent(g2d);
		g2d.dispose();
		
	}
	
	
	
}
