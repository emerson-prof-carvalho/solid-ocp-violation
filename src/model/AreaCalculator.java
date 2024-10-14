package model;

public class AreaCalculator {

	public double calculateArea(Object shape) {

		if (shape instanceof Rectangle) {
			
			Rectangle rectangle = (Rectangle) shape;
			return rectangle.getWidth() * rectangle.getHeight();
		} else if (shape instanceof Circle) {
			
			Circle circle = (Circle) shape;
			return Math.PI * Math.pow(circle.getRadius(), 2);
		} else if (shape instanceof Square) {
			
			Square square = (Square) shape;
			return square.getSide() * square.getSide();
		}

		return 0;
	}
}
