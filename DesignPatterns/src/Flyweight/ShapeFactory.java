package Flyweight;

import java.util.HashMap;

/*
 * 享元工厂类
 */
public class ShapeFactory {

	private static final HashMap<String, Shape> circleMap = new HashMap<>();

	public static Shape getCircle(String color) {

		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {

			circleMap.put(color, circle = new Circle(color));

			System.out.println("Creating circle of color: " + color);
		}

		return circle;
	}
}
