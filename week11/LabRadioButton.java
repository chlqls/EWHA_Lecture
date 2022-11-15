//예제8

import java.awt.*;
import javax.swing.*;

class RadioButtonFrame extends JFrame {
	
	private JTextField textField;
	private JRadioButton RB1;
	private JRadioButton RB2;
	private JRadioButton RB3;
	private JRadioButton RB4;
	
	public RadioButtonFrame() {
		super("RadioButton Test");
		setLayout(new FlowLayout());
		textField = new JTextField("Radio Button Example", 25);
		add(textField);
		
		RB1 = new JRadioButton("RB1");
		RB2 = new JRadioButton("RB2");
		RB3 = new JRadioButton("RB3");
		RB4 = new JRadioButton("RB4");
		
		add(RB1);
		add(RB2);
		add(RB3);
		add(RB4);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(RB1);
		bg.add(RB2);
		bg.add(RB3);
		bg.add(RB4);
		
	}
}

public class LabRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
		radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		radioButtonFrame.setSize(300, 100);
		radioButtonFrame.setVisible(true);
	}

}
