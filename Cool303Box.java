package JavaCool303;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;

/**
 * Extends JPanel and implements Cool303Component.
 * Decorator for JPanel object. It has background color and shape can be changed.
 * @author  Mia Wang(260559637), Zhening Zhang(260622324)
 *
 */
@SuppressWarnings("serial")
public class Cool303Box extends JPanel implements Cool303Component{
	private Cool303Theme theme;
	
	/**
	 * Constructor for Cool303Box, with theme only.
	 * @param theme	Cool303Theme object.
	 */
	public Cool303Box(Cool303Theme theme){
		this.theme = theme;
	}

	
	/**
	 * {@inheritDoc} set box container background color and shape.
	 */
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//revalidate();
		this.theme.setBox(g, this);
		//g2d.dispose();
	}
	
	/**
	 * {@inheritDoc} Set box container's size. If user input size is too small, automatically adjust, otherwise, use user's input.
	 */
	//
	@Override
	public void setPreferredSize(Dimension dimension){
		Dimension old = this.getPreferredSize();
		if(old.getWidth() < dimension.getWidth() && old.getHeight() < dimension.getHeight()){
			super.setPreferredSize(dimension);
		}
	}
	
	/**
	 * Getter method for getting the minimum radius of each box container
	 * @return minimum radius
	 */
	public int getRadius(){
		return Math.min(this.getWidth(), this.getHeight());
	}
	
	/**
	 * {@inheritDoc} Set new insets and return it.
	 */
	@Override
	public Insets getInsets(){
		int radius = this.getRadius();
		Insets insets = new Insets(radius/6, radius/6, radius/6, radius/6);
		return insets;
	}
	
}
