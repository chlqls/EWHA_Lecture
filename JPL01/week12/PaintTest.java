//예제7

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class PaintTest extends JFrame{
	
	public PaintTest() { //생성자
		setSize(400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		Color c = new Color(0, 255, 255);
		g.setColor(c);
		//g.setColor(Color.cyan); // Color.CYAN
		g.fillRect(10, 20, 400, 500);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaintTest p = new PaintTest();

	}

}
