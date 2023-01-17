import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Week12_2_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Frame2 f = new Frame2(); //Frame2의 인스턴스 생성 -> 생성자 실행
	}
}


class Frame2 extends JFrame implements ActionListener {// JFrame을 상속받고 ActionListener을 구현하는 Frame2 클래스
	Color color = new Color(255, 0, 0); //초기 차체 색깔은 빨강색이므로 color을 red로 초기화
	JButton btn;
	JRadioButton red;
	JRadioButton green;
	JRadioButton blue;
	
	public Frame2() { //Frame2의 생성자
		Toolkit tk = getToolkit();
		Dimension d = tk.getScreenSize(); //screen의 가로 세로 크기를 얻어옴
		int screenWidth = d.width;
		int screenHeight = d.height;
		
		setSize(500, 350); //프레임의 크기 설정
		setTitle("MyCar - 최빈"); //프레임 왼쪽 위에 나타나는 title 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임의 X버튼 누르면 프로그램도 종료되도록 설정
		
		setLocation(screenWidth/2-this.getWidth()/2, screenHeight/2-this.getHeight()/2); //frame 위치는 모니터 정중앙에 위치

		CarPanel carPanel = new CarPanel(); //CarPanel 인스턴스를 생성하면 paint()가 자동 실행됨 -> 차 그리기
		add(carPanel, "Center"); //carPanel을 프레임의 CENTER에 붙임
		
		JPanel buttonPanel = new JPanel(); //버튼들을 붙일 패널 생성
		
		red = new JRadioButton("RED", true); //true로 설정해줌으로써 초기상태에 RED가 선택되도록 함
		green = new JRadioButton("GREEN");
		blue = new JRadioButton("BLUE");
		buttonPanel.add(red); //buttonPanel에 JRadioButton들 추가
		buttonPanel.add(green);
		buttonPanel.add(blue);		
		ButtonGroup bg = new ButtonGroup();//위에서 생성한 JRadioButton의 인스턴스들을 ButtonGroup으로 묶음
		bg.add(red);
		bg.add(green);
		bg.add(blue);
		
		btn = new JButton("Paint");
		btn.addActionListener(this); //Frame2가 ActionListener 구현했기 때문에 참조변수 this를 btn에 리스너로 붙임
		buttonPanel.add(btn);
		add(buttonPanel, BorderLayout.SOUTH); //buttonPanel을 프레임의 SOUTH에 붙임
		
		setVisible(true); //위에서 프레임에 붙인 것들을 다 보여준다
	}
	
	
	class CarPanel extends JPanel{
		public void paint(Graphics g) {
			g.setColor(color); //차체 색 설정하고 그리기
			g.fillRect(170, 60, 140, 60);
			g.fillRect(100, 120, 280, 100);
			
			g.setColor(Color.lightGray); //바퀴색은 lightGray로고정
			g.fillOval(140, 180, 80, 80);
			g.fillOval(260, 180, 80, 80);
			
			g.setColor(Color.black); //눈 그리기
			g.drawArc(265, 80, 40, 50, 0, 180);
		}
	}
	
	public void actionPerformed(ActionEvent e) { //클릭된 경우 자동 발생하는 메서드
		if(red.isSelected()) //JRadioButton red가 선택되어 있는 경우
			color = new Color(255, 0, 0);//red로 color 변경
		else if(green.isSelected())
			color = new Color(0, 255, 0);//green
		else if(blue.isSelected())
		color = new Color(0, 0, 255);//blue
		
		repaint(); //자동으로 paint() 호출
	}
	
}


		
		

	
	

