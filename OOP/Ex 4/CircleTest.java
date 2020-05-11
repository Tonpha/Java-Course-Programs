
public class CircleTest {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(2);
		Circle circle3 = new Circle(3, "Blue");
		
		System.out.println(circle1.getRadius());
		System.out.println(circle1.getColor());
		System.out.println(circle1.getArea());
		System.out.println(circle2.getRadius());
		System.out.println(circle2.getColor());
		System.out.println(circle2.getArea());
		System.out.println(circle3.getRadius());
		System.out.println(circle3.getColor());
		System.out.println(circle3.getArea());

	}

}
