package Prototype;

import java.util.Hashtable;

/*
 * 原型管理器
 */
public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {

		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.Clone();
	}

	public static void loadCache() {

		Circle circle = new Circle();
		circle.setId("1");

		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");

		shapeMap.put(circle.getId(), circle);
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
