import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.*;

public class HW2_4_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		PieChart f = new PieChart();//PieChart의 인스턴스 생성 -> 생성자 실행
	}
}

class PieChart extends JFrame implements ActionListener { // JFrame을 상속받고 ActionListener을 구현한 PieChart 클래스
	
	JTextField fieldKim, fieldLee, fieldPark, fieldEtc;
	int kim, lee, park, etc, sum;
	boolean check = false; //초기화면과 실행화면을 구분하기 위해 사용되는 값
	
	public PieChart() { //PieChart의 생성자

		setSize(500, 400);//프레임의 크기 설정
		setTitle("Pie Chart of Student names – 최빈");//프레임 왼쪽 위에 나타나는 title 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 프레임의 X버튼 누르면 프로그램도 종료되도록 설정
		Toolkit tk = getToolkit();
		Dimension d = tk.getScreenSize();//screen의 가로 세로 크기를 얻어옴
		int screenWidth = d.width;
		int screenHeight = d.height;
		setLocation(screenWidth/2-this.getWidth()/2, screenHeight/2-this.getHeight()/2); //frame 위치는 스크린 정중앙에 위치
		
		
		//CENTER
		ChartPanel panelCenter = new ChartPanel(); //ChartPanel 인스턴스를 생성하면 paint()가 자동 실행됨 -> 차트 그리기
		add(panelCenter, BorderLayout.CENTER); //panelCenter를 프레임의 CENTER에 add
		
		
		//SOUTH
		JPanel panelSouth = new JPanel(); //panelSouth를 생성하고 여기에 버튼들을 붙인다
		
		makeLabel("Kim", panelSouth); //makeLabel 메서드를 이용해서 panel에 새로운 label 생성하고 붙임
		fieldKim = new JTextField(6); //TextField 크기 조정
		panelSouth.add(fieldKim);
		
		makeLabel("Lee", panelSouth);
		fieldLee = new JTextField(6);
		panelSouth.add(fieldLee);
		
		makeLabel("Park", panelSouth);
		fieldPark = new JTextField(6);
		panelSouth.add(fieldPark);
		
		makeLabel("Etc", panelSouth);
		fieldEtc = new JTextField(6);
		panelSouth.add(fieldEtc);
		
		
		JButton button = new JButton("Graph"); //매개변수로 받은 text로 button 생성
		panelSouth.add(button); //button을 panel에 붙인다
		button.addActionListener(this); //PieChart가 ActionListener을 구현했기 때문에 참조변수 this를 button에 리스너로 붙임
		
		add(panelSouth, BorderLayout.SOUTH); //panelSouth를 프레임의 SOUTH에 붙임
		
		
		setVisible(true); //위에서 프레임에 붙인 것들을 다 보여준다
	}
	
	class ChartPanel extends JPanel { //inner class
		public void paint(Graphics g) {
			g.setColor(Color.blue);
			
			if(!check) { //처음 실행했을 때 초기화면 보여주기
				g.drawString("Input numbers of names(0~100)", 150, 300);
				check = !check; //이제부터는 초기화면 말고 실행화면 보여주기 위해서 check 값 true로 설정
			}		
			else {
				try {
					//각 학생 성별로 입력된 수(String)를 int값으로 변환하고 저장
					//입력값이 숫자형태가 아니면 NumberFormatException 발생
					kim = Integer.parseInt(fieldKim.getText());
					lee = Integer.parseInt(fieldLee.getText());
					park = Integer.parseInt(fieldPark.getText());
					etc = Integer.parseInt(fieldEtc.getText());
					sum = kim + lee + park + etc;
					
					//입력값이 범위 밖이면 NumberFormatException 발생하도록 설정
					//(이 때 sum이 0인 경우 piechart를 그릴 때 0으로 나눗셈을 하게 되는 오류가 발생하여, 입력값이 모두 0인 경우도 NumberFormatException 발생하도록 설정함)
					if(kim < 0 || kim > 100 || lee < 0 || lee > 100 || park < 0 || park > 100 || etc < 0 || etc > 100 || (kim == 0 && lee == 0 && park == 0 && etc == 0))
						throw new NumberFormatException();
					
					//색깔에 맞춰 비율에 따라 파이 차트 그리고 오른쪽에는 각 성별 학생 수 표시
					g.setColor(Color.orange);
					g.fillArc(150, 110, 140, 140, 0, 360*kim/sum);
					g.drawString("ORANGE: KIMs(" + kim + ")", 350, 150);
					g.setColor(Color.red);
					g.fillArc(150, 110, 140, 140, 360*kim/sum, 360*lee/sum);
					g.drawString("RED: LEEs(" + lee + ")", 350, 170);
					g.setColor(Color.blue);
					g.fillArc(150, 110, 140, 140, 360*kim/sum + 360*lee/sum, 360*park/sum);
					g.drawString("BLUE: PARKs(" + park + ")", 350, 190);
					g.drawString("Total number of students is " + sum, 150, 300); //하단에는 전체 학생 수 표시
					g.setColor(Color.green);
					g.fillArc(150, 110, 140, 140, 360*kim/sum + 360*lee/sum + 360*park/sum, 360*etc/sum);
					g.drawString("GREEN: ETC(" + etc + ")", 350, 210);
					
				}
				catch(NumberFormatException e) { //예외가 발생하면 오류 메시지 출력하고 각 칸을 비움
					g.setColor(Color.black);
					g.drawString("Number should be 0 ~ 100.", 150, 300);
					fieldKim.setText(null);
					fieldLee.setText(null);
					fieldPark.setText(null);
					fieldEtc.setText(null);
				}
				
			}
			
		}
	}
	
	
	public void makeLabel(String text, JPanel panel) { //text와 panel를 매개변수로 받는 makeLabel메서드 정의
		JLabel label = new JLabel(text);
		panel.add(label);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Graph")) { //Graph 버튼 클릭했을 때
			repaint();//자동으로 paint() 호출
		}
		
	}
}

