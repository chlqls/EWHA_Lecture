//예제9

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ColorFrame extends JFrame implements ActionListener {
	Color color = new Color(0, 0, 0);
	JButton button;
	
	ColorFrame() {
		setTitle("Colot Change Test");
		setSize(300, 300); //frame 크기
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel buttonPanel = new JPanel();
		button = new JButton("Color Change"); 
		button.addActionListener(this);//paint() 자동호출??
		buttonPanel.add(button);
		add(buttonPanel, BorderLayout.NORTH);
		
		MyPanel9 p = new MyPanel9();
		add(p, "Center");
		setVisible(true);
	}
	
	class MyPanel9 extends JPanel{
		public void paint(Graphics g) {
			g.setColor(color);
			g.fillRect(10, 0, 260, 210);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		color = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
		repaint();
	}
}


public class ColorChange extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ColorFrame();

	}

}
