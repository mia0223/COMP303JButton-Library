package JavaCool303;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
	public static void main(String[] args){
		Pastel pastel = new Pastel();
		Winter winter = new Winter();
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Cool303Container container = new Cool303Container(pastel, "Mia");
		//Cool303Container container = new Cool303Container(winter);
		Cool303Box box = new Cool303Box(pastel);
		//Cool303Box box = new Cool303Box(pastel);
		//Cool303Box box = new Cool303Box(winter);
		
		box.setLayout(new GridLayout(0,5, 10, 10));
		container.add(box);
		window.setContentPane(container);
		for(int i=1; i<=20; i++){
			Cool303Button button = new Cool303Button(pastel, i);
			//Cool303Button button = new Cool303Button(winter, i);
			button.setPreferredSize(new Dimension(50, 50));
			button.addActionListener(new buttonPressed());
			box.add(button);
		}
		//Cool303Button mia = new Cool303Button(pastel, "mia");
		//mia.setPreferredSize(new Dimension(60,60));
		//box.add(mia);
		//System.out.println("test2---"+box.getPreferredSize());
		box.setPreferredSize(new Dimension(500,500));
		//System.out.println("test2---"+box.getPreferredSize());
		window.pack();
		window.setVisible(true);
		
	}

	
	
}
