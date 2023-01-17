import java.util.Scanner; //Ű�����Է��� ���� �ʿ��� �ڵ�

public class Week3_4_�ֺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171082");
		System.out.println("����: �ֺ�");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //������ kbd��� ��ü�� ���� Ű�����Է¹���
		
		MenuOrder menu = new MenuOrder(); //MenuOrder ������Ʈ ����
		
		System.out.println("--- ���ᰡ�� ���� ---");

		System.out.print("Coke����:");
		menu.setPrice("coke", kbd.nextInt());
		System.out.print("Lemonade����:");
		menu.setPrice("lemonade", kbd.nextInt());
		System.out.print("Coffee����:");
		menu.setPrice("coffee", kbd.nextInt()); //20~25��: ����ڷκ��� �Է� ���� �� ������ ������ menu�� setPrice�޼ҵ带 ����Ͽ� �ν��Ͻ������� ����
		
		
		String answer = "Y";
		while(answer.equalsIgnoreCase("y")) { //��ҹ��� ������� answer�� y�� �� ��� �ݺ��� ����
			System.out.println("\n--- ���� �������� ---");
			menu.setInputMoney(kbd.nextInt()); //����ڷκ��� �Է¹��� �ݾ��� setInputMoney�޼ҵ带 ����Ͽ� menu�� inputMoney���� ����
			
			menu.showMenu();
			
			menu.showResult(menu.getInputMoney()); //private�� inputMoney���� ���͸� �̿��Ͽ� showResult�޼ҵ��� ���ڷ� ����
			
			kbd.nextLine(); //�����ִ� ���͸� �ذ��ϱ� ���� �ڵ�
			System.out.println("��� �Ͻðڽ��ϱ�?(y/n)");
			answer = kbd.nextLine();
			menu.setInputMoney(0); //�ݺ��� ������ menu�� inputMoney���� �ʱ�ȭ
		}
		
		
	}

}


class MenuOrder {

	Scanner kbd = new Scanner(System.in); //������ kbd��� ��ü�� ���� Ű�����Է¹���
	
	private int cokePrice;
	private int lemonadePrice;
	private int coffeePrice;
	private int inputMoney;
	private String drinkSelected;
	
	public void setPrice(String drink, int price) { //String�� int�� ���ڷ� �޾Ƽ� �� ������ ������ �����ϴ� �޼ҵ�
		if(drink.equalsIgnoreCase("coke")) {
			cokePrice = price;
		}
		else if(drink.equalsIgnoreCase("lemonade")) {
			lemonadePrice = price;
		}
		else if(drink.equalsIgnoreCase("coffee"))
		coffeePrice = price;
	}
	
	public void setInputMoney(int inputMoney) { //inputMoney ���� (�߰��� ������ �޼ҵ�)
		this.inputMoney = inputMoney;
	}
	public int getInputMoney() { //inputMoney ��ȯ (�߰��� ������ �޼ҵ�)
		return inputMoney;
	}
	
	public void showMenu() { //�� ����� �������� ȭ�鿡 ������
		System.out.println("--- ���Ḧ �����ϼ��� ---");
		System.out.println("1. Coke: " + cokePrice);
		System.out.println("2. Lemonade: " + lemonadePrice);
		System.out.println("3. Coffee: " + coffeePrice);
	}
	
	public void showResult(int inputMoney) { //int ���� ���ڷ� �޾Ƽ� �� ������ ���ݰ� ����Ͽ� �׿� �´� ��� ���
		
		drinkSelected = kbd.nextLine(); //�޴� ���� 
		
		if(drinkSelected.equals("1")) {
			System.out.println("Coke�� �����ϼ̽��ϴ�.");
			if(inputMoney >= cokePrice) //����ڷκ��� ���� �ݾ��� ������ ���ݺ��� Ŭ ��
				System.out.printf("�ܵ��� %d���Դϴ�.\n", inputMoney - cokePrice);
			else//����ڷκ��� ���� �ݾ��� ������ ���ݺ��� ���� ��
				System.out.printf("%d�� �� �־��ּ���.\n", cokePrice - inputMoney);
		}
		else if(drinkSelected.equals("2")) {
			System.out.println("Lemonade�� �����ϼ̽��ϴ�.");
			if(inputMoney >= lemonadePrice)
				System.out.printf("�ܵ��� %d���Դϴ�.\n", inputMoney - lemonadePrice);
			else
				System.out.printf("%d�� �� �־��ּ���.\n", lemonadePrice - inputMoney);
		}else if(drinkSelected.equals("3")){
			System.out.println("Coffee�� �����ϼ̽��ϴ�.");
			if(inputMoney >= coffeePrice)
				System.out.printf("�ܵ��� %d���Դϴ�.\n", inputMoney - coffeePrice);
			else
				System.out.printf("%d�� �� �־��ּ���.\n", coffeePrice - inputMoney);
		}
			else //���� �޴��� �������� ��
				System.out.println("���� �޴��� �����ϼ̽��ϴ�.");
	}

	
}
