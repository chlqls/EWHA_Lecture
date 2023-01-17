import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HW2_1_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		System.out.println("Input the filename to read."); //사용자로부터 입력파일과 출력파일의 이름을 입력받음
		String inputFileName = kbd.nextLine();
		
		System.out.println("Input the filename to write.");
		String outputFileName = kbd.nextLine();
		
		Scanner inputStream = null;
		PrintWriter outStream = null;
		StringTokenizer token = null;
		
		try {
			inputStream = new Scanner(new File(inputFileName)); //입력스트림 생성
			outStream = new PrintWriter(outputFileName); //출력스트림 생성
		} 
		catch(FileNotFoundException e) { //InputStream 인스턴스 생성 시 발생할 수 있는 예외
			System.out.println("Error opening the file " + inputFileName);
			System.exit(0);
		}
		catch(IOException e) { //적절한 예외처리
			System.out.println("IO Exception occurs.");
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("Exception occurs.");
		}
		
		
		while(inputStream.hasNextLine()) { //입력파일에서 text를 줄 단위로 읽어옴
			String line = inputStream.nextLine();
			token = new StringTokenizer(line, ", \n"); //space와 \n을 분리자로 설정
			while(token.hasMoreTokens()) {
				String word = token.nextToken(); //각 줄에서 token 가져오기
				if(word.length() > 4) //단어 길이가 4 이상인 단어만 출력파일에 쓰기
					outStream.println(word);
			}
		}
		
		inputStream.close();//두 스트림 모두 close
		outStream.close();
		
		System.out.println(outputFileName + " is generated.");
		
	}

}
