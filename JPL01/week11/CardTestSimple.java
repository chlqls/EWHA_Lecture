//예제9

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CardTest extends JFrame implements ActionListener {
	
	JPanel panel;
	CardLayout layout;
	
	public CardTest() {
		setTitle("CardLayout Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		
		panel = new JPanel();
		
		JButton btn1 = new JButton("one");
		JButton btn2 = new JButton("two");
		JButton btn3 = new JButton("three");
		
		layout = new CardLayout();
		panel.setLayout(layout);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		add(panel);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent event) {
		layout.next(panel);
	}
}

public class CardTestSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new CardTest();
	}

}
