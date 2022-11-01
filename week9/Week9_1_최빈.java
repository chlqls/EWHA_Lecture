//"Week9_1_최빈.java"과 "Week9_2_최빈.java"에서 새로 생성된 파일 위치 화면을 캡쳐한 JPG파일은 "Week9_최빈"라는 하나의 이름으로 압축하여 제출했습니다.

//예제4에서 생성된 "number.dat"파일을 2배하여 새로 저장한 것이 "doublenumber.dat"파일이고, "DogFile.dat"파일이 두 번째 과제에서 새로 생성된 파일입니다.


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week9_1_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
		System.out.println("File name for input:"); //사용자로부터 입력파일과 출력파일의 이름을 입력받음
		String inputFileName = kbd.nextLine();
		
		System.out.println("File name for output:");
		String outputFileName = kbd.nextLine();
		
		
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(inputFileName)); //입력스트림 생성
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(outputFileName)); //출력스트림 생성
			
			System.out.println("The numbers in File, " + inputFileName);
			
			try {
				while(true) { //EOFException될 때까지(파일에서 읽어올 내용이 없을 때까지) 무한루프
					int anInteger = inputStream.readInt(); //입력스트림을 통해 예제4에서 만든 파일에 저장된 숫자 읽어오기
					System.out.println(anInteger); //읽어온 숫자 출력
					
					int twiceInteger;
					twiceInteger = anInteger * 2; //위에서 읽어온 숫자를 2배해주고 twiceInteger에 저장
					outputStream.writeInt(twiceInteger); //twiceInteger값을 outputStream을 통해 새로 생성된 파일에 저장
										
				}
			}
			catch(EOFException e) { //더이상 읽어올 데이터가 없을 때 발생하는 예외
				System.out.println("End of reading from file, " + inputFileName);
			}
			
			
			System.out.println(outputFileName + " is generated.\n");
				
			outputStream.close(); //두 스트림 모두 close
			inputStream.close();
		}
		catch(FileNotFoundException e) { //ObjectInputStream 인스턴스 생성 시 발생할 수 있는 예외
			System.out.println("Cannot find file " + inputFileName);
		}
		catch(IOException e) { //ObjectInputStream와 ObjectOutputStream 모두에서 발생할 수 있는 예외
			System.out.println("Problem with input or output from file.");
		}
		
		
		
		try { // 새로 생성된 파일을 읽기 목적으로 다시 열기
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(outputFileName));//입력스트림 생성
			
			System.out.println("The numbers in new File, " + outputFileName);
			
			try {
				while(true) {//EOFException될 때까지(파일에서 읽어올 내용이 없을 때까지) 무한루프
					int anInteger = inputStream.readInt(); //새로 생성된 파일에 저장된 숫자 읽어오기
					System.out.println(anInteger); // 읽어온 숫자 출력
				}
			}
			catch(EOFException e) {//더이상 읽어올 데이터가 없을 때 발생하는 예외처리
				System.out.println("End of reading from 2nd File, " + outputFileName);
			}
			inputStream.close(); //열었던 입력스트림 닫기
		}
		catch(FileNotFoundException e) { //읽어올 파일이 없을 때 발생하는 예외처리
			System.out.println("Cannot find file " + outputFileName);
		}
		catch(IOException e) { //input output의 전반적인 예외처리 담당
			System.out.println("Problem with input from file " + outputFileName);
		}
				
		
		
	}

}


