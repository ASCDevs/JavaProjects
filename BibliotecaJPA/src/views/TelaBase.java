package views;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class TelaBase extends JFrame {

	public TelaBase(){
		setTitle("Standard Layout");
		setBounds(200,100,800,500);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
}
