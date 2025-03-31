package Facade;

/*
 * 外观类
 */
public class ShapeMaker {

	private Circle circle;
	private Rectangle rectangle;
	private Square square;

	/*
	 * 构造函数
	 */
	public ShapeMaker() {

		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	/*
	 * 画圆
	 */
	public void drawCircle() {
		
		circle.draw();
	}
	
	/*
	 * 画矩形
	 */
	public void drawRectangle() {
		
		rectangle.draw();
	}
	
	/*
	 * 画正方形
	 */
	public void drawSquare() {
		
		square.draw();
	}
}
