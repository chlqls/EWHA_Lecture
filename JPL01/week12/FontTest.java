//예제8

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFontComponent extends JComponent {
	
	Font f1, f2, f3, f4, f5;
	public MyFontComponent() {
		f1 = new Font("Serif", Font.PLAIN, 20);
		f2 = new Font("San Serif", Font.BOLD, 30);
		f3 = new Font("Monospaced", Font.ITALIC, 40);
		f4 = new Font("Dialog", Font.BOLD | Font.ITALIC, 20);
		f5 = new Font("DialogInput", Font.BOLD, 10);
		
	}
	public void paint(Graphics g) {
		g.setFont(f1);
		g.drawString("Serif 20 points PLAIN", 10, 50);
		
		g.setFont(f2);
		g.drawString("San Serif 30 points BOLD", 10, 100);
		
		g.setFont(f3);
		g.setColor(Color.red);
		g.drawString("Monospaced 40 points ITALIC", 10, 150);
		
		g.setFont(f4);
		g.drawString("Dialog 20 points BOLD and ITALIC", 10, 200);
		
		g.setFont(f5);
		g.drawString("DialogInput 10 points BOLD", 10, 250);
	}
}


public class FontTest extends JFrame{
	
	public FontTest() {
		setTitle("Font Test");
		setSize(700, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		MyFontComponent c = new MyFontComponent();
		add(c);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FontTest f = new FontTest();
	}

}
