//예제2

import java.util.ArrayList;
import java.util.Scanner;

class Time {
	int hour;
	int minute;
	int second;
	
	Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String toString() {
		return "Hour: " + hour + "\tMinute: " + minute + "\tSecond: " + second;
 	}
}
public class TimeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kbd = new Scanner(System.in);
		System.out.println("How many times do you want to generate?");
		int n = kbd.nextInt();
		
		ArrayList <Time> t = new ArrayList<Time>();
		
		int i = 0;
		for(i = 0; i < n; i++) {
			t.add(new Time(randNum(24), randNum(60), randNum(60)));
		}
		for(i = 0; i < t.size(); i++) {
			System.out.print("<Time " + (i + 1) + "> ");
			System.out.println(t.get(i));
		}
	}
	
	public static int randNum(int n) {
		return (int)(Math.random() * n);
	}

}
