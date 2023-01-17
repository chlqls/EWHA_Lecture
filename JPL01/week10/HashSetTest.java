//예제8

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> mySet = new HashSet<String> (); //HashSet
		Scanner kbd = new Scanner(System.in);
		System.out.println("Input 5 Names");
		
		for(int i = 0; i < 5; i++)
			mySet.add(kbd.next()); //add()
		
		System.out.println("HashSet size : " + mySet.size()); //size()
		
		Iterator<String> it = mySet.iterator(); //Iterator
		String name;
		while(it.hasNext()) { //it.hasNext()
			name = it.next(); //next()
			System.out.println(name);
		}
	}

}
