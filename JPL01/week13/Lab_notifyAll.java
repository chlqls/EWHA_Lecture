//예제8

class SharedArea8 {
	double result;
	boolean isWritten;
}
 
class ComputeThread8 extends Thread {
	SharedArea8 sharedArea;
	
	public void run() {
		double res = 0.0;
		for(int i = 1; i < 100000; i+=2) {
			if(i/2%2 == 0) res += 1.0 / i;
			else res -= 1.0 / i;
		}
		
		sharedArea.result = res * 4;
		sharedArea.isWritten = true;
		synchronized(sharedArea) {
			sharedArea.notifyAll();
		}
	}
}

class PrintThread8 extends Thread {
	SharedArea8 sharedArea;
	
	public void run() {
		if(sharedArea.isWritten != true) {
			try {
				synchronized(sharedArea) {
					sharedArea.wait();
				}
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(sharedArea.result);
	}
}

class SimplePrintThread extends Thread {
	SharedArea8 sharedArea;
	
	public void run() {
		if(sharedArea.isWritten != true) {
			try {
				synchronized(sharedArea) {
					sharedArea.wait();
				}
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.printf("%.2f \n", sharedArea.result);
	}
}

class CutePrintThread extends Thread {
	SharedArea8 sharedArea;
	
	public void run() {
		if(sharedArea.isWritten != true) {
			try {
				synchronized(sharedArea) {
					sharedArea.wait();
				}
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("<<< pi = " + sharedArea.result + " >>>");
	}
}


public class Lab_notifyAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputeThread8 thread1 = new ComputeThread8();
		PrintThread8 thread2 = new PrintThread8();
		SimplePrintThread thread3 = new SimplePrintThread();
		CutePrintThread thread4 = new CutePrintThread();
				
		SharedArea8 SH = new SharedArea8();
		
		thread1.sharedArea = SH;
		thread2.sharedArea = SH;
		thread3.sharedArea = SH;
		thread4.sharedArea = SH;
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
			
	}
}
