package JavaCool303;

import java.awt.*;
import javax.swing.border.Border;
/**
 * An abstract class of Cool303Theme
 * @author Mia Wang(260559637), Zhening Zhang(260622324)
 * Stored all theme information.
 */
public abstract class Cool303Theme{
	private Color bgColor;
	private Color[] buttonColor;
	private Color borderColor;
	private Border border;
	private String themeName;
	private Color textColor;
	
	
	/**
	 * Setter method for setting the button label under Theme
	 * @param x	the color of label under Theme.
	 */
	public void setTextColor(Color x){
		textColor = x;
	}
	
	/**
	 * Getter method for getting color of label from Theme
	 * @return the color of label of Theme.
	 */
	public Color getTextColor(){
		return textColor;
	}
	
	/**
	 * Getter method for getting color of button from Theme
	 * @return the color of button of Theme.
	 */
	public Color[] getButtonColor(){
		Color[] copy = new Color[buttonColor.length];
		for(int i=0; i<buttonColor.length; i++){copy[i] = buttonColor[i];}
		return copy;
	}
	
	/**
	 * Getter method for getting color of background from Theme
	 * @return the color of background of Theme.
	 */
	public Color getBgColor(){
		return bgColor;
	}
	
	/**
	 * Getter method for getting color of background from Theme
	 * @return the color of background of Theme.
	 */
	public Color getBorderColor(){
		return borderColor;
	}

	/**
	 * Getter method for getting name of Theme
	 * @return name of the theme.
	 */
	public String getName(){
		return themeName;
	}
	
	/**
	 * Setter method for setting button color under Theme
	 * @param x the color of button
	 */
	public void setButtonColor(Color[] x){
		buttonColor = new Color[x.length];
		for(int i=0; i<x.length; i++){
			buttonColor[i] = x[i];
		}
	}
	
	/**
	 * Setter method for setting background color of container under Theme
	 * @param x the color of container background
	 */
	public void setBgColor(Color x){
		bgColor = x;
	}
	
	/**
	 * Setter method for setting border color of button under Theme
	 * @param x the color of button border
	 */
	public void setBorderColor(Color x){
		borderColor = x;
	}
	
	/**
	 * Setter method for setting border under Theme
	 * @param x the border of button
	 */
	public void setBorder(Border x){
		border = x;
	}
	
	/**
	 * Setter method for setting button color under Theme
	 * @param x the color of button
	 */
	public void setName(String x){
		themeName = x;
	}
	
	/**
	 * Abstract method, set the Cool303Button button color, button border color, and button shape
	 * @param g	the graphics object for drawing
	 * @param button	Cool303Button object
	 * @return	the decorated button
	 */
	public abstract Graphics2D setButton(Graphics g, Cool303Button button);
	
	/**
	 * Abstract method, set the Cool303Box box background color, and button shape
	 * @param g	the graphics object for drawing
	 * @param box	Cool303Box object
	 * @return	the decorated box container
	 */
	public abstract Graphics2D setBox(Graphics g, Cool303Box box);
	
	/**
	 * Abstract method, set the Cool303Container window position and the optional title
	 * @param g	the graphics object for drawing
	 * @param window	Cool303Container object
	 * @return	the decorated window container
	 */
	public abstract Graphics2D setContainer(Graphics g, Cool303Container window);
	
}