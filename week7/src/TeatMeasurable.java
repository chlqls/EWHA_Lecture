//예제5
public class TeatMeasurable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle2 myRectangle = new Rectangle2(10, 20);
		System.out.println("<Rectangle>");
		System.out.println("Perimeter: " + myRectangle.getPerimeter());
		System.out.println("Area: " + myRectangle.getArea());
		
		Circle1 myCircle = new Circle1(10);
		System.out.println("<Circle>");
		System.out.printf("Circumference: %.2f\n", myCircle.getCircumference());
		System.out.printf("Area: %.2f\n", myCircle.getArea());
	}

}

interface Measurable {
	public double getPerimeter();
	public double getArea();
}

class Circle1 implements Measurable {
	private double myRadius;
	public Circle1(double cir) {
		myRadius = cir;
	}
	public double getPerimeter() {
		return 2 * Math.PI * myRadius;
	}
	public double getCircumference() {
		return getPerimeter();
	}
	public double getArea() {
		return Math.PI * myRadius * myRadius;
	}
}

class Rectangle2 implements Measurable {
	private double myWidth;
	private double myHeight;
	
	public Rectangle2(double wid, double hei) {
		myWidth = wid;
		myHeight = hei;
	}
	public double getPerimeter() {
		return 2 * (myWidth + myHeight);
	}
	public double getArea() {
		return (myWidth * myHeight);
	}
}