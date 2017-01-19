package JavaCool303;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class buttonPressed implements ActionListener{
	public void actionPerformed(ActionEvent e){
		Cool303Button button = (Cool303Button) e.getSource();
		System.out.println("Button you clicked is "+button.getIndex());
	}
}
