//예제10

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class OuterClass {
	
	int x = 200;
	InnerClass IC = new InnerClass();
	
	void methodOC() {
		//System.out.println("y from innerClass = " + y); //error
		System.out.println("y of InnerClass from OuterClass = " + IC.y);
	}
	
	class InnerClass {
		int y = 400;
		
		void methodIC() {
			System.out.println("x of OuterClass from InnerClass = " + x);
		}
	}
	
}

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		
		System.out.println("oc.x = " + oc.x); //200
		System.out.println("ic.y = " + ic.y); //400
		//System.out.println("ic.x = " + ic.x); //error
		//System.out.println("oc.y = " + oc.y);//error
		
		oc.methodOC(); //400
		ic.methodIC(); //200
	}

}
