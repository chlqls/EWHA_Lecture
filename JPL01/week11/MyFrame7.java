//예제7

import java.awt.*;
import javax.swing.*;


public class MyFrame7 extends JFrame {
	public MyFrame7() {
		
		setTitle("BoxLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		makeButton(panel, "Button1");
		makeButton(panel, "Button2");
		makeButton(panel, "Button3");
		makeButton(panel, "B4");
		makeButton(panel, "Long Button5");
		add(panel);
		
		pack();
		setVisible(true);
	}
	
	private void makeButton(JPanel panel, String text) {
		JButton button = new JButton(text);
		button.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(button);
	}
	
	public static void main(String[] args) {
		MyFrame7 f = new MyFrame7();
	}
}

