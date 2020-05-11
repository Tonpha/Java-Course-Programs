
public class MyRectangle {
	
	double width = 1;
	double height = 1;
	
	MyRectangle(){
		
	}
	
	MyRectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	
	double getArea() {
		double area = this.width * this.height;
		return area;
	}
	
	double getPerimeter() {
		double perimeter = 2 * width + 2 * height;
		return perimeter;
	}

}
