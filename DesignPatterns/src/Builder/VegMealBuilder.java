package Builder;

/*
 * 具体建造者类
 */
public class VegMealBuilder implements MealBuilder {

	private Meal meal;

	public VegMealBuilder() {

		this.meal = new Meal();
	}

	@Override
	public void BuildBurger() {
		// TODO Auto-generated method stub
		meal.setBurger("Veg Burger");
	}

	@Override
	public void BuildDrink() {
		// TODO Auto-generated method stub
		meal.setDrink("Coke");
	}

	@Override
	public Meal getMeal() {
		// TODO Auto-generated method stub
		return meal;
	}

}
