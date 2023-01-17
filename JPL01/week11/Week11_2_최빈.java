import java.awt.*;
import javax.swing.*;

public class Week11_2_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Frame2 f = new Frame2();//Frame2의 인스턴스 생성 -> 생성자 실행
	}
}


class Frame2 extends JFrame { // JFrame을 상속받은 Frame2 클래스
	
	public Frame2() { //Frame2의 생성자

		setSize(350, 200);//프레임의 크기 설정
		setTitle("Student Information");//프레임 왼쪽 위에 나타나는 title 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 프레임의 X버튼 누르면 프로그램도 종료되도록 설정
		setLayout(new BorderLayout());//프레임의 layout을 BorderLayout으로 설정(사실 default로 BorderLayout이기 때문에 굳이 설정안해줘도 되는 부분)
		
		//NORTH
		JPanel panelNorth = new JPanel();// JPanel의 인스턴스 생성(panelNorth)
		JLabel label = new JLabel("STUDENT INFORMATION");//"STUDENT INFORMATION"로 텍스트를 설정한 JLabel의 인스턴스 생성
		panelNorth.add(label);//panelNorth에 label 붙이기
		add(panelNorth, BorderLayout.NORTH); //panelNorth를 프레임의 NORTH에 add
		
		//CENTER
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,2));//JPanel의 인스턴스 생성하고 cloumn수가 2인 GridLayout으로 설정

		//여기서부터 생성되는 label, field들을 GridLayout에 맞춰 자동으로 정렬됨
		
		//첫번째줄
		JLabel label1 = new JLabel("NAME");
		panel.add(label1);
		JTextField field1 = new JTextField();
		panel.add(field1);

		//두번째줄
		JLabel label2 = new JLabel("GENDER");
		panel.add(label2);
		//radiobutton의 경우 따로 panel을 만들어서 그 안에 radiobutton을 붙이고 panel을 frame에 붙인다
		JPanel panelRadio = new JPanel();
		JRadioButton RB1 = new JRadioButton("Male");
		JRadioButton RB2 = new JRadioButton("Female", true); //true로 설정해줌으로써 초기상태에 Female이 선택되도록 함
		panelRadio.add(RB1);
		panelRadio.add(RB2);
		ButtonGroup bg = new ButtonGroup(); //위에서 생성한 JRadioButton의 인스턴스들을 ButtonGroup으로 묶는다
		bg.add(RB1);
		bg.add(RB2);
		panel.add(panelRadio);

		//세번째줄
		JLabel label3 = new JLabel("ID");
		panel.add(label3);
		JTextField field3 = new JTextField();
		panel.add(field3);

		//네번째줄
		JLabel label4 = new JLabel("DEPARTMENT");
		panel.add(label4);
		JTextField field4 = new JTextField();
		panel.add(field4);

		add(panel, BorderLayout.CENTER); //panel을 프레임의 CENTER에 붙인다
		
		//SOUTH
		JPanel panelSouth = new JPanel(); //panelSouth를 생성하고 여기에 버튼들을 붙인다
		JButton btn1 = new JButton("Save");
		JButton btn2 = new JButton("Cancel");
		panelSouth.add(btn1);
		panelSouth.add(btn2);
		
		add(panelSouth, BorderLayout.SOUTH); //panelSouth를 프레임의 SOUTH에 붙임
		
		pack(); //pack() 하면 처음에 설정했던 크기인 (350, 200)보다 작아지지만 과제 예시 화면과 동일해져서 이 메서드를 실행했습니다
		setVisible(true); //위에서 프레임에 붙인 것들을 다 보여준다
	}
}

