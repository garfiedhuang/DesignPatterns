import Composite.Developer;

public class OutoffMemoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;

		try {
			Developer developer = new Developer("Boss", 20000);

			while (true) {
				developer.add(new Developer("张山", 6000));
				developer.add(new Developer("张山", 6000));
				developer.add(new Developer("李四", 8000));

				i++;

				System.out.println(i);
			}
		} catch (OutOfMemoryError ex) {

			System.out.println("Caught OutOfMemoryError: " + ex.getMessage());
		}
	}

}
