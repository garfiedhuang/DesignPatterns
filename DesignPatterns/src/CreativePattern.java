import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import AbstractFactory.NotImplementException;
import Builder.Meal;
import Builder.MealDirector;
import Builder.VegMealBuilder;
import FactoryMethod.Shape;
import FactoryMethod.ShapeFactory;
import Prototype.Circle;
import Prototype.Rectangle;
import Prototype.ShapeCache;
import Singleton.Singleton1;
import Singleton.Singleton2;

/**
 * 创建型模式
 */
public class CreativePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 工厂方法模式测试
		factoryMethodTest();

		// 抽象工厂模式测试
		abstractFactoryTest();

		// 单例模式测试
		singleton1Test();
		singleton2Test();

		// 建造者模式测试
		builderTest();
		
		// 原型模式测试
		prototypeTest();
	}

	/*
	 * 工厂方法模式测试
	 */
	public static void factoryMethodTest() {

		System.out.println("--------工厂方法模式测试--------");
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape("FactoryMethod1");

		shape.draw();
	}

	/*
	 * 抽象工厂模式测试
	 */
	public static void abstractFactoryTest() {

		try {

			System.out.println("--------抽象工厂模式测试--------");
			AbstractFactory af1 = FactoryProducer.getFactroy("color");
			AbstractFactory af2 = FactoryProducer.getFactroy("shape");

			af1.getColor("red").fill();
			af1.getColor("green").fill();
			af2.getShape("circle").draw();
			af2.getShape("rectangle").draw();

		} catch (IllegalArgumentException e1) {

			System.out.println(e1.getMessage());

		} catch (NotImplementException e2) {

			System.out.println(e2.getMessage());
		}
	}

	/*
	 * 懒汉式单例模式测试
	 */
	public static void singleton1Test() {

		System.out.println("--------懒汉式单例模式测试--------");
		Singleton1.getInstance().test();
	}

	/*
	 * 双重检查锁定单例模式测试
	 */
	public static void singleton2Test() {

		System.out.println("--------双重检查锁定单例模式测试--------");
		Singleton2.getInstance().test();
	}

	/*
	 * 建造者模式测试
	 */
	public static void builderTest() {

		System.out.println("--------双重检查锁定单例模式测试--------");
		MealDirector mealDirector = new MealDirector(new VegMealBuilder());

		Meal meal = mealDirector.constructMeal();
		String desc = meal.toString();

		System.out.println(desc);
	}
	
	/*
	 * 原型模式测试
	 */
	public static void prototypeTest() {
		
		System.out.println("--------原型模式测试--------");
		ShapeCache.loadCache();
		Circle shape1 = (Circle)ShapeCache.getShape("1");
		Rectangle shape2 = (Rectangle)ShapeCache.getShape("2");
		
		shape1.draw();
		shape2.draw();
	}
}
