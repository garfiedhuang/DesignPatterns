package Builder;

/*
 * 指挥类
 */
public class MealDirector {

	private MealBuilder mealBuilder;

	public MealDirector(MealBuilder mealBuilder) {

		this.mealBuilder = mealBuilder;
	}

	public Meal constructMeal() {

		mealBuilder.BuildBurger();
		mealBuilder.BuildDrink();

		return mealBuilder.getMeal();
	}
}
