package Singleton;

public class Singleton1 {

	private static Singleton1 instance;

	private Singleton1() {
	}

	/*
	 * 懒汉式，线程安全
	 */
	public static synchronized Singleton1 getInstance() {

		if (instance == null) {

			instance = new Singleton1();
		}

		return instance;
	}
	
	public void test() {
		
		System.out.println("懒汉式，线程安全单例模式。");
	}
}
