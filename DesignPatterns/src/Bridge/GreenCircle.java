package Bridge;

public class GreenCircle implements DrawApi {

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub

		System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", y: " + y + " ]");
	}

}
