import java.util.Scanner; //키보드입력을 위해 필요한 코드

public class Week3_3_최빈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171082");
		System.out.println("성명: 최빈");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //앞으로 kbd라는 객체를 통해 키보드입력받음
		
//		String title;
//		int page; //과제안내 피피티에는 있었는데 제가 작성한 코드에서는 필요없어서 주석처리 했습니다!
		
		MyFile fold = new MyFile();//MyFile 오브젝트 생성 (원래 File)
		MyFile fnew = new MyFile();//MyFile 오브젝트 생선 (새로 만드는 File)
		
		System.out.println("--File정보입력(제목,페이지수)--");
		
		fold.setTitle(kbd.nextLine());//setTitle메서드로 fold의 제목 설정
		fold.setPage(kbd.nextInt());//setPage메서드로 fold의 페이지수 설정
		fold.fileCopy(fnew); //fold의 정보를 fnew에 저장
		
		System.out.println("<원래 File>");
		fold.fileInfo();//fold의 정보 출력
		
		System.out.println("<복사된 File>");
		fnew.fileInfo();//fnew의 정보 출력
		
	}

}


class MyFile {//MyFile클래스 생성
	
	private String title;//멤버변수 선언
	private int page;
	
	public void setTitle(String title) {//title 값 설정하는 메소드 정의
		this.title = title;
	}
	
	public String getTitle() {//title 값 반환하는 메소드 정의
		return title;
	}

	public void setPage(int page) {//page 값 설정하는 메소드 정의
		this.page = page;
	}
	
	public int getPage() {//page 값 반환하는 메소드 정의
		return page;
	}

	public void fileCopy(MyFile myFile) { //원래 file의 정보를 myFile에 동일한 제목, 페이지수가 저장되도록 하는 메소드 정의
		myFile.title = title;
		myFile.page = page;
	}
	
	public void fileInfo() { //파일 정보 출력하는 메소드 정의
		System.out.println("파일제목:" + title);
		System.out.println("페이지:" + page);
		
	}
}
