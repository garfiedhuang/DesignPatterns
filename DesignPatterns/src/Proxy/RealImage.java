package Proxy;

/*
 * 具体类
 */
public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {

		this.fileName = fileName;
		this.loadFromDisk(fileName);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName) {

		System.out.println("Loading " + fileName);
	}

}
