//예제10

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class ImgTest extends JFrame{
	
	public ImgTest() { //생성자
		Toolkit tk = getToolkit();
		//Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int screenWidth = d.width;
		int screenHeight = d.height;
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(screenWidth/2-this.getWidth()/2, screenHeight/2-this.getHeight()/2); //frame 위치는 모니터 정중앙에 위치
		
		Image img = tk.getImage("cat.jpg");
		JLabel label = new JLabel(new ImageIcon(img));
		add(label);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImgTest();

	}

}
