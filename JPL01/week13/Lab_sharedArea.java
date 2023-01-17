//예제5

class SharedArea5 {
	double result;
	boolean isWritten;
}
 
class ComputeThread5 extends Thread {
	SharedArea5 sharedArea;
	
	public void run() {
		double res = 0.0;
		for(int i = 1; i < 100000; i+=2) {
			if(i/2%2 == 0) res += 1.0 / i;
			else res -= 1.0 / i;
		}
		
		sharedArea.result = res * 4;
		sharedArea.isWritten = true;
	}
}

class PrintThread5 extends Thread {
	SharedArea5 sharedArea;
	
	public void run() {
		while(sharedArea.isWritten != true) continue;
		System.out.println(sharedArea.result);
	}
}

public class Lab_sharedArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputeThread5 thread1 = new ComputeThread5();
		PrintThread5 thread2 = new PrintThread5();
		SharedArea5 SH = new SharedArea5();
		
		thread1.sharedArea = SH;
		thread2.sharedArea = SH;
		
		thread1.start();
		thread2.start();
	
	}
}
