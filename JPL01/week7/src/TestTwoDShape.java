//예제4
public class TestTwoDShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle2 myTriangle = new Triangle2();
		Rectangle myRectangle = new Rectangle();
		
		myTriangle.width = 10;
		myTriangle.height = 15;
		myTriangle.showDim();
		myTriangle.showStyle("right triangle");
		System.out.println("Area : " + myTriangle.area());
		
		myRectangle.width = 10;
		myRectangle.height = 10;
		myRectangle.showDim();
		myRectangle.isSquare();
		System.out.println("Area : " + myRectangle.area());
	}

}

abstract class TwoDShape {
	double width;
	double height;
	String name;
	
	public void showDim() {
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
	}
	public abstract double area();
}

class Rectangle extends TwoDShape {
	public void isSquare() {
		if(width == height)
			System.out.println("Square");
		else
			System.out.println("Not Square");
	}
	public double area() {
		return width * height;
	}
}

class Triangle2 extends TwoDShape {
	private String style; //사용하지않은 변수 -> 수정해야될 부분
	public void showStyle(String style) {
		System.out.println("Style: " + style);
	}
	public double area() {
		return width * height / 2;
	}
}
