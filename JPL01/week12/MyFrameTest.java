//예제2

import java.awt.event.*;

import javax.swing.*;

class MyFrame extends JFrame {
	private JButton button;
	
	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Event Test");
		
		JPanel panel = new JPanel();
		button = new JButton("Press the Button");
		button.addActionListener(new MyListener());
		panel.add(button);
		this.add(panel);
		this.setVisible(true);
	}
	
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				button.setText("Button Pressed");
			}
		}
	}
}
public class MyFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();

	}

}
