//예제3

import java.awt.event.*;

import javax.swing.*;

class MyFrame2 extends JFrame implements ActionListener{
	private JButton button;
	
	public MyFrame2() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Event Test");
		
		JPanel panel = new JPanel();
		button = new JButton("Press the Button");
		button.addActionListener(this);
		panel.add(button);
		this.add(panel);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			button.setText("Button Pressed");
		}
	}
	
}
public class MyFrameTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame2 f = new MyFrame2();

	}

}
