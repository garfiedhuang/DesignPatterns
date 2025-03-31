package AbstractFactory;

/*
 * 抽象工厂接口
 */
public interface AbstractFactory {

	Color getColor(String color);

	Shape getShape(String shape);

}