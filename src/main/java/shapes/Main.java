package shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Square(9.0));
		shapes.add(new Rectangle(3.0, 3.0));
		shapes.add(new Circle(5));
		shapes.add(new Circle(9));
		shapes.add(new Circle(2));
		shapes.add(new Circle(1));
		shapes.add(new Triangle(8, 5));
		shapes.add(new Triangle(24, 14));
		
		Collections.sort(shapes);
		
		shapes.forEach(shape -> System.out.println(shape.getClass() + " : " + shape.getArea()));
	}
}
