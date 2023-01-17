//예제7

class SharedArea7 {
	Account7 Acc1;
	Account7 Acc2;	
	
	void transfer(int money) {
		synchronized(this) {
				int money1 = Acc1.withdraw(money);
				System.out.println("1000 draw from Acc1");
				
				Acc2.deposit(money1);
				System.out.println("1000 deposit in Acc2");
		}
	}
		
	int getTotal() {
		synchronized(this) {
		return Acc1.balance + Acc2.balance;
		}
	}
}

class Account7 {
	String accountNo;
	String ownerName;
	int balance;
	
	Account7(String accountNo,String ownerName, int balance) {
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
 
class TransferThread7 extends Thread {
	int money1;
	SharedArea7 sharedArea;
	
	TransferThread7(SharedArea7 area) {
		sharedArea = area;
	}
	
	public void run() {
		for(int month = 1; month <= 12; month++) {
			sharedArea.transfer(1000);
		}
	}
	
}

class PrintThread7 extends Thread {
	SharedArea7 sharedArea;
	
	PrintThread7(SharedArea7 area) {
		this.sharedArea = area;
	}
	
	public void run() {
		for(int i = 0; i < 3; i++) {
			int sum = sharedArea.getTotal();
				System.out.println("Sum of money : " + sum);
				
			try {
				sleep(1);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Lab_Account2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedArea7 sharedArea = new SharedArea7();
		
		sharedArea.Acc1 = new Account7("Tom", "123", 30000000);
		sharedArea.Acc2 = new Account7("Jane", "456", 10000000);
		
		TransferThread7 thread1 = new TransferThread7(sharedArea);
		PrintThread7 thread2 = new PrintThread7(sharedArea);
		
		thread1.start();
		thread2.start();
	
	}
}
