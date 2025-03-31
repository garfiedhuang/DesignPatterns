package Bridge;

/*
 * 实现了抽象类Shape的实体类
 */
public class Circle extends Shape {

	private int radius, x, y;

	public Circle(int radius, int x, int y, DrawApi drawApi) {
		super(drawApi);

		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

		drawApi.drawCircle(radius, x, y);
	}

}
