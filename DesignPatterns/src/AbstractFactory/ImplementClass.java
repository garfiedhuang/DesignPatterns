package AbstractFactory;

/*
 * 具体产品接口
 */
class Red implements Color {

	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("Filling with red color.");
	}

}

/*
 * 具体产品接口
 */
class Green implements Color {

	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("Filling with green color.");
	}

}

/*
 * 具体产品接口
 */
class Circle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a circle.");
	}

}

/*
 * 具体产品接口
 */
class Rectangle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a rectangle.");
	}

}


/*
 * 具体类工厂（形状）
 */
class ShapeFactory implements AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub

		if (shape == null) {
			return null;
		}

		if (shape.equalsIgnoreCase("circle")) {

			return new Circle();

		} else if (shape.equalsIgnoreCase("rectangle")) {

			return new Rectangle();
		}

		return null;
	}

}

/*
 * 具体类工厂（颜色）
 */
class ColorFactory implements AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub

		if (color == null) {
			return null;
		}

		if (color.equalsIgnoreCase("red")) {

			return new Red();
		} else if (color.equalsIgnoreCase("green")) {

			return new Green();
		}

		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
