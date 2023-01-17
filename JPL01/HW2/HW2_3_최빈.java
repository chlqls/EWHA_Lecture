import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.*;

public class HW2_3_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		InputFrame f = new InputFrame();//InputFrame의 인스턴스 생성 -> 생성자 실행
	}
}

class Student { //학생 정보 담은 Student class 생성
	String id;
	String name;
	int gender = 1;
	String dept;
	
	Student() {} //기본생성자
	Student (String id, String name, int gender, String dept) { //매개변수로 전달받은 학생 정보를 저장하는 생성자
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
	}
}

class InputFrame extends JFrame implements ActionListener { // JFrame을 상속받고 ActionListener을 구현한 InputFrame 클래스
	
	JTextField field1, field2, field4;
	JRadioButton RB1, RB2;
	HashMap<String, Student> hm = new HashMap<String, Student>(); // HashMap 생성
	
	public InputFrame() { //InputFrame의 생성자

		setSize(300, 200);//프레임의 크기 설정
		setTitle("New Student");//프레임 왼쪽 위에 나타나는 title 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 프레임의 X버튼 누르면 프로그램도 종료되도록 설정
		setLocation(0, 0);
		
		//NORTH
		JPanel panelNorth = new JPanel();// JPanel의 인스턴스 생성(panelNorth)
		JLabel label = new JLabel("STUDENT INFORMATION");//"STUDENT INFORMATION"로 텍스트를 설정한 JLabel의 인스턴스 생성
		panelNorth.add(label);//panelNorth에 label 붙이기
		add(panelNorth, BorderLayout.NORTH); //panelNorth를 프레임의 NORTH에 add
		
		//CENTER
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,2));//JPanel의 인스턴스 생성하고 column 수가 2인 GridLayout으로 설정

		//여기서부터 생성되는 label, field들은 GridLayout에 맞춰 자동으로 정렬됨
		
		//첫번째줄
		JLabel label1 = new JLabel("ID");
		panel.add(label1);
		field1 = new JTextField();
		panel.add(field1);

		//두번째줄
		JLabel label2 = new JLabel("NAME");
		panel.add(label2);
		field2 = new JTextField();
		panel.add(field2);

		//세번째줄
		JLabel label3 = new JLabel("GENDER");
		panel.add(label3);
		//radiobutton의 경우 따로 panel을 만들어서 그 안에 radiobutton을 붙이고 panel을 frame에 붙인다
		JPanel panelRadio = new JPanel();
		RB1 = new JRadioButton("Male");
		RB2 = new JRadioButton("Female", true); //true로 설정해줌으로써 초기상태에 Female이 선택되도록 함
		panelRadio.add(RB1);
		panelRadio.add(RB2);
		ButtonGroup bg = new ButtonGroup(); //위에서 생성한 JRadioButton의 인스턴스들을 ButtonGroup으로 묶는다
		bg.add(RB1);
		bg.add(RB2);
		panel.add(panelRadio);
		

		//네번째줄
		JLabel label4 = new JLabel("DEPT");
		panel.add(label4);
		field4 = new JTextField();
		panel.add(field4);

		add(panel, BorderLayout.CENTER); //panel을 프레임의 CENTER에 붙인다
		
		//SOUTH
		JPanel panelSouth = new JPanel(); //panelSouth를 생성하고 여기에 버튼들을 붙인다
		makeButton("save", panelSouth); //makeButton 메서드를 사용해서 순차적으로 panelSouth에 새로운 버튼 생성하고 붙임
		makeButton("cancel", panelSouth);
		makeButton("result", panelSouth);
		
		add(panelSouth, BorderLayout.SOUTH); //panelSouth를 프레임의 SOUTH에 붙임
		
		setVisible(true); //위에서 프레임에 붙인 것들을 다 보여준다
	}
	
	public void makeButton(String text, JPanel panel) { //text와 panel를 매개변수로 받는 makeButton메서드 정의
		JButton button = new JButton(text); //매개변수로 받은 text로 button 생성
		panel.add(button); //button을 panel에 붙인다
		button.addActionListener(this); //InputFrame이 ActionListener을 구현했기 때문에 참조변수 this를 button에 리스너로 붙임
	}
	
	public void actionPerformed(ActionEvent e) { //클릭된 경우 자동 발생하는 메서드
		if(e.getActionCommand().equals("save")) { //"save" button을 클릭하면 HashMap에 입력한 정보 저장하기
			int gender = 1; //female
			if(RB1.isSelected())
				gender = 0; //male
			Student s = new Student(field1.getText(), field2.getText(), gender, field4.getText()); //새로 Student 객체 만들고
			hm.put(field1.getText(), s); //key가 ID값이고 value가 Student 객체인 데이터를 hm에 저장
		}
		else if(e.getActionCommand().equals("result")) { //reset 누르면 결과창 보여주기
			OutputFrame f = new OutputFrame(hm); //OutputFrame 생성자를 호출하면서 인자로 hashmap 보내기
		}
		
		//각 버튼 클릭 이후에는 항상 초기화면 상태로 보여주기
		field1.setText(null);
		field2.setText(null);
		field4.setText(null);
		RB2.setSelected(true);
		
	}
}


class OutputFrame extends JFrame { // JFrame을 상속받은 OutputFrame 클래스
	public OutputFrame(HashMap hm) { //Frame2의 생성자

		setSize(300, 200);//프레임의 크기 설정
		setTitle("Student List");//프레임 왼쪽 위에 나타나는 title 설정
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //OutputFrame을 닫으면 OutputFrame만 닫히고 프로그램은 계속 진행되도록 설정
		setLocation(0, 200); //입력창 하단에 결과창 나타나도록 위치 조정

		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,4));//JPanel의 인스턴스 생성하고 column수가 4인 GridLayout으로 설정
		
		//makeLabel 메서드를 이용해서 순차적으로 panel에 새로운 label 생성하고 붙임
		makeLabel("ID", panel);
		makeLabel("NAME", panel);
		makeLabel("GENDER", panel);
		makeLabel("DEPARTMENT", panel);
		
		//Iterator사용해서 hm의 element 나열하기 
		Set s = hm.keySet(); //key값의 set 만들기
		Iterator<String> it = s.iterator(); //Iterator 인스천스 생성 (이 때 key는 String)
		
		while(it.hasNext()) { //hanNext()로 다음 값이 있는지 확인
			String key = it.next(); //key 저장
			Student student = (Student) hm.get(key); //key 이용해서 value 가져오기 (downcasting)
			
			//학생 정보를 label로 panel에 추가
			makeLabel(student.id, panel);
			makeLabel(student.name, panel);
			if(student.gender == 0)
				makeLabel("Male", panel);
			else
				makeLabel("Female", panel);
			makeLabel(student.dept, panel);
		}
		
		add(panel);
		setVisible(true); //위에서 프레임에 붙인 것들을 다 보여준다
	}
		
	public void makeLabel(String text, JPanel panel) { //text와 panel를 매개변수로 받는 makeLabel 메서드 정의
		JLabel label = new JLabel(text);
		panel.add(label);
	}
	
}

