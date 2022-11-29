//예제6

class SharedArea6 {
	Account Acc1;
	Account Acc2;	
}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	Account(String accountNo,String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit(int amount) {
		this.balance += amount;
	}
	
	int withdraw(int amount) {
		if(balance < amount)
			return 0;
		balance -= amount;
		return amount;
	}
}
 
class TransferThread extends Thread {
	int money;
	SharedArea6 sharedArea;
	
	TransferThread(SharedArea6 area) {
		sharedArea = area;
	}
	
	public void run() {
		for(int month = 1; month <= 12; month++) {
			synchronized(sharedArea) {
				money = sharedArea.Acc1.withdraw(1000);
				System.out.println("Month " + month + " : 1000 drawal from Acc1");
				
				sharedArea.Acc2.deposit(1000);
				System.out.println("Month " + month + " : 1000 deposit in Acc2");
			}
		}
	}
}

class PrintThread6 extends Thread {
	SharedArea6 sharedArea;
	
	PrintThread6(SharedArea6 area) {
		sharedArea = area;
	}
	
	public void run() {
		for(int i = 0; i < 50; i++) {
			synchronized(sharedArea) {
				int money_sum = sharedArea.Acc1.balance + sharedArea.Acc2.balance;
				System.out.println("Sum of money : " + money_sum);
			}
			try {
				sleep(1);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Lab_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedArea6 sharedArea = new SharedArea6();
		
		sharedArea.Acc1 = new Account("Tom", "123", 30000000);
		sharedArea.Acc2 = new Account("Jane", "456", 10000000);
		
		TransferThread thread1 = new TransferThread(sharedArea);
		PrintThread6 thread2 = new PrintThread6(sharedArea);
		
		thread1.start();
		thread2.start();
	
	}
}
