class SimpleCircle {
  private double radius;
  static int numberOfObjects = 0;

  /** Construct a circle with radius 1 */
  SimpleCircle() {
    setRadius(1);
    numberOfObjects++;
  }

  /** Construct a circle with a specified radius */
  SimpleCircle(double newRadius) {
    setRadius(newRadius);
    numberOfObjects++;
  }
  
  /** Return the current number of objects */
  static int getNumObjects() {
	  return numberOfObjects;
  }

  /** Return the area of this circle */
  double getArea() {
    return getRadius() * getRadius() * Math.PI;
  }

  /** Return the perimeter of this circle */
  double getPerimeter() {
    return 2 * getRadius() * Math.PI;
  }

  /** Set a new radius for this circle */
  void setRadius(double newRadius) {
    radius = newRadius;
  }

public double getRadius() {
	return radius;
}
}