package vis85_MenuManager;

public class MenuItem 

/**
 * Class MenuItem
 * @author : Vinay Sriharish
 * @created: 11/27/2022
 */
{
	String name;
	String description;
	int calories;
	double price;

	/**
	 * Method MenuItem
	 * @param name a string
	 * @param desc a string
	 * @param cal a int
	 * @param price a double
	 */


	public MenuItem(String name, String desc, int cal, double price)
	{
		this.name = name;
		this.description = desc;
		this.calories = cal;
		this.price = price;
	}

	public String toString()
	{
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


}
