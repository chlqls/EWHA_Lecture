import java.awt.*;
import javax.swing.*;

public class Week11_1_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Frame1 f = new Frame1(); //Frame1의 인스턴스 생성 -> 생성자 실행
	}
}


class Frame1 extends JFrame {// JFrame을 상속받은 Frame1 클래스
	
	public Frame1() { //Frame1의 생성자

		setSize(300, 200); //프레임의 크기 설정
		setTitle("Calculator"); //프레임 왼쪽 위에 나타나는 title 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임의 X버튼 누르면 프로그램도 종료되도록 설정
		setLayout(new BorderLayout()); //프레임의 layout을 BorderLayout으로 설정(사실 default로 BorderLayout이기 때문에 굳이 설정안해줘도 되는 부분)
		
		JTextField field = new JTextField();// JTextField의 인스턴스 생성
		field.setHorizontalAlignment(JTextField.RIGHT); //텍스트 입력을 오른쪽에부터 받기위해 필요한 문장 
		add(field, BorderLayout.NORTH); //field를 프레임의 North에 add
		
		JPanel panel = new JPanel(); //JPanel의 인스턴스 생성
		panel.setLayout(new GridLayout(0,4)); //panel의 layout을 column개수가 4인 GridLayout로 설정 
		
		makeButton("ON", panel); //makeButton메서드를 이용해서 순차적으로 panel에 새로운 버튼 생성하고 붙임
		makeButton("AC", panel);
		makeButton("C", panel);
		makeButton("OFF", panel);
		makeButton("7", panel);
		makeButton("8", panel);
		makeButton("9", panel);
		makeButton("/", panel);
		makeButton("4", panel);
		makeButton("5", panel);
		makeButton("6", panel);
		makeButton("X", panel);
		makeButton("1", panel);
		makeButton("2", panel);
		makeButton("3", panel);
		makeButton("-", panel);
		makeButton("0", panel);
		makeButton(".", panel);
		makeButton("=", panel);
		makeButton("+", panel);
		
		add(panel, BorderLayout.CENTER); //버튼들을 붙인 panel을 프레임의 CENTER에 붙임

		setVisible(true); //위에서 프레임에 붙인 것들을 다 보여준다
	}
	
	public void makeButton(String text, JPanel panel) { //text와 panel를 매개변수로 받는 makeButton메서드 정의
		JButton button = new JButton(text); //매개변수로 받은 text로 button 생성
		panel.add(button); //button을 panel에 붙인다
	}
}

