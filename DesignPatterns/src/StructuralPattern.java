import java.util.List;

import Adapter.AudioPlayer;
import Bridge.RedCircle;
import Composite.Developer;
import Composite.Employee;
import Decorator.Shape;
import Decorator.ShapeDecorator;
import Facade.ShapeMaker;
import Flyweight.ShapeFactory;
import Proxy.ProxyImage;
import Decorator.Circle;
import Decorator.Rectangle;
import Decorator.RedShapeDecorator;

/*
 * 结构型模式
 */
public class StructuralPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 适配器模式测试
		adapterTest();

		// 装饰器模式设计
		decoratorTest();

		// 代理模式测试
		proxyTest();

		// 外观模式测试
		facadeTest();

		// 桥接模式测试
		bridgeTest();

		// 组合模式测试
		compositeTest();
		
		// 享元模式测试
		flyweightTest();
	}

	/*
	 * 适配器模式测试
	 */
	public static void adapterTest() {

		System.out.println("--------------------------------");
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("aaxx", "E:\\work\\source\\workspace\\DesignPatterns\\XXX.aaxx");
		audioPlayer.play("mp3", "E:\\work\\source\\workspace\\DesignPatterns\\XXX.mp3");
		audioPlayer.play("vlc", "E:\\work\\source\\workspace\\DesignPatterns\\XXX.vlc");
		audioPlayer.play("mp4", "E:\\work\\source\\workspace\\DesignPatterns\\XXX.mp4");
	}

	/*
	 * 装饰器模式测试
	 */
	public static void decoratorTest() {

		System.out.println("--------------------------------");
		Shape circle = new Circle();
		ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
		ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();

	}

	/*
	 * 代理模式测试
	 */
	public static void proxyTest() {

		System.out.println("--------------------------------");
		Proxy.Image image = new ProxyImage("proxy_image.png");

		image.display();
		System.out.println("");
		image.display();

	}

	/*
	 * 外观模式测试
	 */
	public static void facadeTest() {

		System.out.println("--------------------------------");
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

	/*
	 * 桥接模式测试
	 */
	public static void bridgeTest() {

		System.out.println("--------------------------------");
		Bridge.Shape redCircle = new Bridge.Circle(100, 100, 10, new RedCircle());
		Bridge.Shape greenCircle = new Bridge.Circle(200, 200, 20, new Bridge.GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}

	/*
	 * 组合模式测试
	 */
	public static void compositeTest() {

		System.out.println("--------------------------------");
		Developer developer = new Developer("Boss", 20000);

		developer.add(new Developer("张山", 6000));
		developer.add(new Developer("张山", 6000));
		developer.add(new Developer("李四", 8000));

		List<Employee> list = developer.getList();

		for (Employee item : list) {

			System.out.println(item.toString());
		}
	}

	/*
	 * 享元模式测试
	 */
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black", "Yellow" };

	public static void flyweightTest() {

		System.out.println("--------------------------------");
		
		for (int i = 0; i < 50; i++) {

			Flyweight.Circle circle = (Flyweight.Circle) ShapeFactory.getCircle(getRandomColor());

			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			
			circle.draw();
		}
	}

	private static String getRandomColor() {

		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {

		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {

		return (int) (Math.random() * 100);
	}

}
