package vis85_MenuManager;
/**
 * Class Entree
 * author : Vinay Sriharish
 * created: 10/08/2022
 */

public class Entree
{



	// Declaring Entree name description and calories

	private String name;
	private String description;
	private int calories;

	//Storing name of Entree, description, calories

	public Entree (String name, String description, int calories)
	{
		this.name = name;
		this.description = description;
		this.calories = calories;

	}
	//Getters and Setters for name, description, calories

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




}
