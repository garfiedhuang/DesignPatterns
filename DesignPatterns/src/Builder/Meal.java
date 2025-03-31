package Builder;

/*
 * 产品类
 */
public class Meal {

	private String burger;
	private String drink;

	public void setBurger(String burger) {

		this.burger = burger;
	}

	public void setDrink(String drink) {

		this.drink = drink;
	}

	@Override
	public String toString() {

		return "Burger: " + burger + " Drink: " + drink;
	}
}
