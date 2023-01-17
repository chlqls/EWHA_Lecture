import java.awt.event.*;
import javax.swing.*;


public class Week12_1_최빈 {

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
	JButton btn; //Jbutton 참조변수 선언
	
	public Frame1() { //Frame1의 생성자
		setSize(300, 300); //프레임의 크기 설정
		setTitle("나 잡아봐~라! - 최빈"); //프레임 왼쪽 위에 나타나는 title 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임의 X버튼 누르면 프로그램도 종료되도록 설정
		setResizable(false); //프레임 크기 고정

		JPanel panel = new JPanel(); //JPanel의 인스턴스 생성
		btn = new JButton("Click!"); //"Click!"이라고 써있는 Jbutton 인스턴스 생성
		btn.addMouseListener(new myMouseEvent());//myMouseEvent 인스턴스 생성하고 btn에 mouse리스너 붙임
		panel.add(btn); //btn을 panel에 add
		
		add(panel); //버panel을 프레임에 붙임
		setVisible(true); //위에서 프레임에 붙인 것들을 다 보여준다
	}
	
	
	class myMouseEvent extends MouseAdapter { //MouseAdapter를 상속받은 myMouseEvent inner class 정의
		public void mouseClicked(MouseEvent e) { //마우스로 클릭했을 때 자동실행되는 메서드
			System.out.println("윽,,,잡혔다ㅠㅠ");
		}
		
		public void mouseEntered(MouseEvent e) { //마우스가 해당 영역에 들어갔을 때 자동실행되는 메서드
			int randomX = (int)(Math.random()*240); //버튼의 크기를 고려하여 화면을 벗어나지않도록 적당한 랜덤값 설정
			int randomY = (int)(Math.random()*240);
			btn.setLocation(randomX, randomY); //btn영역에 마우스 들어가면 random한 위치로 이동

			System.out.println("x = " + randomX + ", y = " + randomY); //이동한 위치 출력
			//System.out.println("x = " + e.getX() + ", y = " + e.getY());
		}
	}
	
}




