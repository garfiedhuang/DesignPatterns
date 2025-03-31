package Decorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratorShape) {
		super(decoratorShape);
		// TODO Auto-generated constructor stub
	}

	public void draw() {

		decoratorShape.draw();
		setRedBorder(decoratorShape);
	}

	private void setRedBorder(Shape decoratorShape) {
		// TODO Auto-generated method stub

		System.out.println("Drawing red border.");
	}

}
