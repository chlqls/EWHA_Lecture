//예제5

import java.awt.event.*;

import javax.swing.*;


public class MouseAdapterTest extends JFrame{
	JPanel p = new JPanel();
	JLabel myLabel;
	
	public MouseAdapterTest() { //생성자
		setTitle("Mouse Adapter Test");
		p.addMouseListener(new myMouseEvent()); //panel에 리스너 붙임
		
		myLabel = new JLabel("Location of the mouse");
		myLabel.setSize(50, 20);
		myLabel.setLocation(30, 30);
		p.add(myLabel);
		add(p);
		
		setSize(200, 200); //frame 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class myMouseEvent extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			myLabel.setText("x = " + x + ", y = " + y);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseAdapterTest();

	}

}
