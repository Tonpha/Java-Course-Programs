
public class Circle {
	double radius = 1.0;
	String color = "Red";
	
	Circle(){
		
	}
	
	Circle(double newRadius){
		radius = newRadius;
	}

	Circle(double newRadius, String newColor){
		radius = newRadius;
		color = newColor;
	}
	
	double getRadius() {
		return radius;
	}
	
	String getColor() {
		return color;
	}
	
	double getArea() {
		return radius*radius*3.14;
	}
}
