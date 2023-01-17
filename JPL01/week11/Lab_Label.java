//예제3

import javax.swing.*;

class MyFrame3 extends JFrame {
	public MyFrame3() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Hello?");
		JButton button = new JButton("Button");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setEditable(false);
		
		panel.add(t1);
		panel.add(t2);
		
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
}

public class Lab_Label {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFrame3 f = new MyFrame3();
	}

}
