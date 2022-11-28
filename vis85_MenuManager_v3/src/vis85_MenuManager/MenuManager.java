package vis85_MenuManager;

import java.util.ArrayList;

public class MenuManager
/**
 * Class MenuManager
 * @author : Vinay Sriharish
 * @created: 11/27/22
 */
{
	ArrayList<Entree> entrees = new ArrayList<Entree>();
	ArrayList<Side> sides = new ArrayList<Side>();
	ArrayList<Salad> salads = new ArrayList<Salad>();
	ArrayList<Dessert> desserts = new ArrayList<Dessert>();

	/**
	 * Method MenuManager
	 * @param dishesFile a string
	 */


	public MenuManager (String dishesFile)
	{
		ArrayList<MenuItem> menuItems = FileManager.readItems(dishesFile);

		for (MenuItem item:menuItems)
		{
			if(item instanceof Entree)
			{
				entrees.add((Entree)item);
			}
			else if (item instanceof Side)
			{
				sides.add((Side)item);
			}
			else if(item instanceof Salad)
			{
				salads.add((Salad)item);
			}
			else if(item instanceof Dessert)
			{
				desserts.add((Dessert)item);
			}
		}




	}
	/**
	 * Method randomMenu
	 * @param name a String
	 * @return menu
	 */


	public Menu randomMenu(String name)
	{
		int randomEntree=(int)(Math.random()*4);
		int randomSide=(int)(Math.random()*3);
		int randomSalad=(int)(Math.random()*4);
		int randomDesert=(int)(Math.random()*3);




		Menu menu = new Menu("Random Menu", 
				entrees.get(randomEntree),
				sides.get(randomSide),
				salads.get(randomSalad),
				desserts.get(randomDesert));

		return menu;



	}

	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}






}
