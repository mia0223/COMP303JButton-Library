package JavaCool303;
import java.awt.*;

/**
 * Built in Cool303Theme choice Winter. It extends Cool303Theme
 * @author Mia Wang(260559637), Zhening Zhang(260622324)
 *
 */
public class Winter extends Cool303Theme{
	private final Color[] buttonColor = {new Color(109, 124, 146),new Color(164, 205, 226), new Color(207, 217, 228), new Color(207, 226, 234),
										 new Color(189,228,235)};
	
	/**
	 * Constructor for Winter theme, "Winter" as theme name, text color is white, border color is white, background color is grey blue, button colors
	 * can be changed based on their index.
	 */
	public Winter(){
		setName("Winter");
		setTextColor(Color.WHITE);
		setBorderColor(Color.white);
		//setBgColor(new Color(178,202,223));
		setBgColor(new Color(155,166,183));
		setButtonColor(buttonColor);
	}
	
	/**
	 * {@inheritDoc} Output colored button with write border and with hexagon shape.
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
		
		int width = button.getWidth();	int height = button.getHeight();
		int[] xPoly = {width/2, width, width, width/2, 0, 0};
		int[] yPoly = {0, height/4, 3*height/4, height, 3*height/4, height/4};
		Polygon p = new Polygon(xPoly, yPoly, 6);
		g2d.setColor(color);
		g2d.fillPolygon(p);
		//g2d.fillRect(0, 0, button.getWidth()-1, button.getHeight()-1);
		g2d.setColor(this.getBorderColor());
		g2d.drawPolygon(p);
		//g2d.drawRect(0, 0, button.getWidth()-1, button.getHeight()-1);
		return g2d;
	}
	
	/**
	 * {@inheritDoc} Output colored panel with hexagon shape.
	 */
	@Override
	public Graphics2D setBox(Graphics g, Cool303Box box) {
		Graphics2D g2d = (Graphics2D) g.create();
		int width = box.getWidth(); int height = box.getHeight();
		int[] xPoly = {width/2, width, width, width/2, 0, 0};
		int[] yPoly = {0, height/4, 3*height/4, height, 3*height/4, height/4};
		Polygon p = new Polygon(xPoly, yPoly, 6);
		g2d.setColor(this.getBgColor());
		g2d.fillPolygon(p);
		return g2d;
	}
	
	@Override
	public Graphics2D setContainer(Graphics g, Cool303Container container){
		Graphics2D g2d = (Graphics2D) g.create();
		return g2d;
	}
	

}
