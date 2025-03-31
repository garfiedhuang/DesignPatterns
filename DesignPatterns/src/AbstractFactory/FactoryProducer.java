package AbstractFactory;

/*
 * 工厂创造其
 */
public class FactoryProducer {

	public static AbstractFactory getFactroy(String code) throws IllegalArgumentException, NotImplementException {

		if (code.isBlank()) {

			throw new IllegalArgumentException("输入不能为空");
		}

		if (code.equalsIgnoreCase("color")) {

			return new ColorFactory();
		} else if (code.equalsIgnoreCase("shape")) {

			return new ShapeFactory();
		} else {

			throw new NotImplementException("功能开发中...");
		}
	}

}