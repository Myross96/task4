package shapes;

public abstract class Shape implements Comparable<Shape> {
	
	public abstract double getArea();

	@Override
	public int compareTo(Shape shape) {
		return (int) (getArea() - shape.getArea());
	}	
}
