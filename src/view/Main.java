package view;

import model.AreaCalculator;
import model.Circle;
import model.Rectangle;
import model.Square;

public class Main {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5.0, 10.0);
		Circle circle = new Circle(8.5);
		Square sqre = new Square(12.0);
		
		AreaCalculator calculator = new AreaCalculator();
		
		System.out.printf("Área retângulo %.2f\n", calculator.calculateArea(rect));
		System.out.printf("Área círculo %.2f\n", calculator.calculateArea(circle));
		System.out.printf("Área quadrado %.2f\n", calculator.calculateArea(sqre));
	}

}
