//예제5-5

class Tv {
	boolean power;
	int channel;
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class VCR {
	boolean power;
	int counter = 0;
	void power() {
		power = !power;
	}
	
	void play() { System.out.println("Play VCR"); }
	
	void stop() { System.out.println("Stop VCR"); }
	
	void rew() { System.out.println("Rewind VCR"); }
	
	void ff() {	System.out.println("Fast Forward VCR");	}
}


class TVCR extends Tv {
	VCR vcr = new VCR();
	
	int counter = vcr.counter;
	
	void play() { vcr.play(); }
	void stop() { vcr.stop(); }
	void rew() { vcr.rew(); }
	void ff() { vcr.ff(); }
	
	void power() {
		super.power();
		System.out.println("TVCR power " + (power?"On":"OFF"));
	}
	
	void channelUp() {
		++channel;
		System.out.println("Channel No: " + channel);
	}
	
	void channelDown() {
		super.channelDown();
		System.out.println("Channel No: " + channel);
	}
}

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TVCR myTVCR = new TVCR();
		
		myTVCR.power();
		myTVCR.channelUp();
		myTVCR.play();
//		myTVCR.vcr.play();
		myTVCR.stop();

		
	}

}
