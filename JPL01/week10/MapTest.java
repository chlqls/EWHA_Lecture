//예제9

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> myMap = new HashMap<String, String>(); //Map HashMap
		Scanner kbd = new Scanner(System.in);
		
		String ID, name, str;
		System.out.println("Input 5 IDs and Names");
		
		for(int i = 0; i < 5; i++) {
			ID = kbd.next();
			name = kbd.next();
			myMap.put(ID, name); //put()
		}
		
		System.out.println("HashMap size : " + myMap.size()); //size()
		System.out.println("Input ID to search:");
		
		ID = kbd.next();
		System.out.println(myMap.get(ID)); //get()
		System.out.println(myMap);
		
		Set s = myMap.keySet(); //Set, ketSet()
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()) {
			str = it.next();
			System.out.println("<" + str + "," + myMap.get(str) + ">"); //get()
		}
	}

}
