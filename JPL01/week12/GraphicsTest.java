//예제6

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyComponent extends JComponent {

	public static final int x = 30;
	public static final int y = 80;
	
	public void paint(Graphics g) {
		g.drawString("Hello! Everyone!!!", x, y);
		g.drawLine(x, y+10, x+100, y+10);
	}
}


public class GraphicsTest extends JFrame{

	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;
	
	public GraphicsTest() {
		setTitle("MyFrane");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		MyComponent c = new MyComponent();
		add(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicsTest g = new GraphicsTest();
	}

}
