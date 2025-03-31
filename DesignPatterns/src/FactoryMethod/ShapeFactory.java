package FactoryMethod;

/*
 * 工厂类
 */
public class ShapeFactory{
	
	public Shape getShape(String shapeType)
	{
		if(shapeType==null)
		{
		   return null;
		}
		
		if(shapeType.equalsIgnoreCase("FactoryMethod1")) {
			
			return new FactoryMethod1();
		}
		else if(shapeType.equalsIgnoreCase("FactoryMethod2")) {
			return new FactoryMethod2();
		}
		else if(shapeType.equalsIgnoreCase("FactoryMethod3")) {
			return new FactoryMethod3();
		}
		else {
			
			return null;
		}
	}

}
