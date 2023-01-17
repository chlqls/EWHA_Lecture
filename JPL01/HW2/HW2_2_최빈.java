import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HW2_2_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");

		Calculator f = new Calculator(); //Frame1의 인스턴스 생성 -> 생성자 실행
		
	}

}

class Calculator extends JFrame implements ActionListener {// JFrame을 상속받고 ActionListener을 구현하는 Calculator 클래스
	JTextField text;
	int n; //클릭한 수 저장 
	int mode; //계산방식(+,-,*,/)을 숫자(1~4)로 저장
	int result; //계산결과 저장
	double division; //나눗셈의 결과 저장
	
	public Calculator() { //Calculator의 생성자

		setSize(300, 200); //프레임의 크기 설정
		setTitle("Calculator"); //프레임 왼쪽 위에 나타나는 title 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임의 X버튼 누르면 프로그램도 종료되도록 설정
		
		text = new JTextField();// JTextField의 인스턴스 생성
		text.setHorizontalAlignment(JTextField.RIGHT); //텍스트 입력이 오른쪽부터 되게끔 
		add(text, BorderLayout.NORTH); //text를 프레임의 North에 add
		
		JPanel panel = new JPanel(); //JPanel의 인스턴스 생성
		panel.setLayout(new GridLayout(0,4)); //panel의 layout을 column개수가 4인 GridLayout로 설정 
		
		makeButton("7", panel);//makeButton메서드를 이용해서 순차적으로 panel에 새로운 버튼 생성하고 붙임
		makeButton("8", panel);
		makeButton("9", panel);
		makeButton("/", panel);
		makeButton("4", panel);
		makeButton("5", panel);
		makeButton("6", panel);
		makeButton("*", panel);
		makeButton("1", panel);
		makeButton("2", panel);
		makeButton("3", panel);
		makeButton("-", panel);
		makeButton("New", panel);
		makeButton("0", panel);
		makeButton("=", panel);
		makeButton("+", panel);
		
		add(panel, BorderLayout.CENTER); //버튼들을 붙인 panel을 프레임의 CENTER에 붙임

		setVisible(true); //위에서 프레임에 붙인 것들을 다 보여준다
	}
	
	public void makeButton(String text, JPanel panel) { //text와 panel를 매개변수로 받는 makeButton메서드 정의
		JButton button = new JButton(text); //매개변수로 받은 text로 button 생성
		panel.add(button); //button을 panel에 붙인다
		button.addActionListener(this); //Calculator가 ActionListener을 구현했기 때문에 참조변수 this를 button에 리스너로 붙임
	}
	
	public void actionPerformed(ActionEvent e) { //클릭된 경우 자동 발생하는 메서드
		if(e.getActionCommand().equals("New")) { //"New" button을 클릭하면 textfield 내용 지우고 새로운 계산 시작
			text.setText(null); //모든 값을 초기화
			n = 0;
			mode = 0;
			result = 0;
			division = 0;
		}
		else if(e.getActionCommand().equals("0")) //0~9 버튼을 클릭하면 해당 숫자와 현재 저장되어 있는, 사용자가 직전에 선택한 계산방식(+,-,*,/)을 cal메서드에 넘김
			cal(0, mode);
		else if(e.getActionCommand().equals("1"))
			cal(1, mode);
		else if(e.getActionCommand().equals("2"))
			cal(2, mode);
		else if(e.getActionCommand().equals("3"))
			cal(3, mode);
		else if(e.getActionCommand().equals("4"))
			cal(4, mode);
		else if(e.getActionCommand().equals("5"))
			cal(5, mode);
		else if(e.getActionCommand().equals("6"))
			cal(6, mode);
		else if(e.getActionCommand().equals("7"))
			cal(7, mode);
		else if(e.getActionCommand().equals("8"))
			cal(8, mode);
		else if(e.getActionCommand().equals("9"))
			cal(9, mode);
		else if(e.getActionCommand().equals("+")) //덧셈인 경우 mode를 1로 설정
			mode = 1;
		else if(e.getActionCommand().equals("-")) //뺄셈이면 2
			mode = 2;
		else if(e.getActionCommand().equals("*")) //곱셈이면 3 
			mode = 3;
		else if(e.getActionCommand().equals("/")) //나눗셈이면 4
			mode = 4;
		else if(e.getActionCommand().equals("=")) { //=버튼을 클릭할 경우 계산결과 textField에 출력
			String data;
			if(mode == 4) //만약 직전 계산이 나눗셈이면 소수점까지 출력
				data = Double.toString(division); //textField에 출력하기 위해 double값을 String으로 변환
			else
				data = Integer.toString(result); //textField에 출력하기 위해 int값을 String으로 변환
			text.setText(data);
		}
	}
	
	public void cal(int n, int mode) { //한자리 수만 계산 가능한 단순화된 계산기임
		text.setText(Integer.toString(n));//int값을 String으로 변환하여 숫자 button을 클릭하면 textfield에 해당 수가 나타나도록 설정
		
		if(mode == 0) //계산 새로 시작할 때는 result에 현재 수 대입
			result = n;
		else if(mode == 1) //덧셈
			result += n;
		else if(mode == 2) //뺄셈
			result -= n;
		else if(mode == 3) //곱셈
			result *= n;
		else if(mode == 4) //나눗셈(소수점까지 저장되도록 double값으로 저장)
			division = (double)result / n; //나눗셈의 경우 소수점까지 출력
	}
}

