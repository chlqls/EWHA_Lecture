import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Week10_2_최빈 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> student = new HashMap<String, String>(); //ID(String)과 이름(String)을 각각 <key, value> 쌍으로 저장하는 HashMap 생성
		Scanner kbd = new Scanner(System.in);

		String ID, name, str;
		
		while(true) { //사용자가 0 0 입력할 때까지 무한루프
			ID = kbd.next();
			name = kbd.next();
			if(ID.equals("0") && name.equals("0")) //0 0 입력하면 반복문 종료
				break;
			student.put(ID, name); //put() 메서드 사용해서 HashMap에 저장
		}
		
		System.out.println("<학생명단>"); 
		System.out.println("[ID]\t\t[NAME]");
		
		Set s = student.keySet(); //ketSet()메서드로 키 값만 뽑아서 s에 저장
		Iterator<String> it = s.iterator(); //s에서 Iterator 사용
		
		str = it.next(); //임의의 key값 str에 저장
		int maxLength = student.get(str).length(), minLength = student.get(str).length(); //각각 str에 대응되는 value의 길이를 저장
		String maxID = str, minID = str; //각각 str 저장

		System.out.println(str + "\t\t" + student.get(str)); //get()메서드를 이용해서 str과 그에 대응되는 vlaue값 출력
		
		while(it.hasNext()) { //다음 데이터가 없을 때까지 반복문 실행
			str = it.next(); //다음 key값
			System.out.println(str + "\t\t" + student.get(str));
			
			if(student.get(str).length() > maxLength) { //현재 저장된 값보다 더 긴 이름이 나오면 길이 및 ID 모두 업데이트
				maxLength = student.get(str).length();
				maxID = str;
			}
			if(student.get(str).length() < minLength) { //현재 저장된 값보다 더 짧은 이름이 나오면 길이 및 ID 모두 업데이트
				minLength = student.get(str).length();
				minID = str;
			}		
			
		}

		System.out.println("\n전체 학생수: " + student.size()); //size()로 전체 학생수 출력

		System.out.println("<가장 긴 이름을 가진 학생>");
		System.out.println("ID:" + maxID + " Name:" + student.get(maxID) + " 길이:" + maxLength);
		
		System.out.println("<가장 짧은 이름을 가진 학생>");
		System.out.println("ID:" + minID + " Name:" + student.get(minID) + " 길이:" + minLength);
		
		
	}
}
