package Builder;

/*
 * 建造者接口
 */
public interface MealBuilder {

	void BuildBurger();
	void BuildDrink();
	Meal getMeal();
}
