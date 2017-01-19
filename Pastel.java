package JavaCool303;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Built in Cool303Theme choice Pastel. It extends Cool303Theme
 * @author Mia Wang(260559637), Zhening Zhang(260622324)
 *
 */

public class Pastel extends Cool303Theme implements Cool303Component {
	private final Color[] buttonColor = {new Color(255, 214, 211),new Color(241,199,211), new Color(209,188,207), new Color(240,234,202),
			 new Color(182,221,220)};
	
	/**
	 * Constructor for Pastel theme. "Pastel" as theme name, text color is white, background color is lavender purple, button border color is
	 * white.
	 */
	public Pastel(){
		setName("Pastel");
		setTextColor(Color.WHITE);
		setBorderColor(Color.white);
		setBgColor(new Color(181,165,191));
		setButtonColor(buttonColor);
	}
	
	/**
	 * {@inheritDoc} Output colored button with write border and with bubble like shape.
	 */
	@Override
	public Graphics2D setButton(Graphics g, Cool303Button button){
		//drawRect(xTopLeft, yTopLeft, width, height)
		Graphics2D g2d = (Graphics2D) g.create();
		Color color;
		if((button.getIndex()-1)%buttonColor.length == 0){color = buttonColor[0];}
		else if((button.getIndex()-1)%buttonColor.length == 1){color = buttonColor[1];}
		else if((button.getIndex()-1)%buttonColor.length == 2){color = buttonColor[2];}
		else if((button.getIndex()-1)%buttonColor.length == 3){color = buttonColor[3];}
		else {color = buttonColor[4];}
		button.setFocusPainted(false);
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		
		g2d.setColor(color);
		g2d.fillOval(0, 0, button.getWidth()-1, button.getHeight()-1);;
		g2d.setColor(this.getBorderColor());
		g2d.drawOval(0, 0, button.getWidth()-1, button.getHeight()-1);
		return g2d;
	}
	
	/**
	 * {@inheritDoc} Output colored panel with bubble like shape.
	 */
	@Override
	public Graphics2D setBox(Graphics g, Cool303Box box) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setColor(this.getBgColor());
		g2d.fillOval(0, 0, box.getWidth()-1, box.getHeight()-1);
		return g2d;
}

	@Override
	public Graphics2D setContainer(Graphics g, Cool303Container container){
		Graphics2D g2d = (Graphics2D) g.create();
		return g2d;
		}
}
