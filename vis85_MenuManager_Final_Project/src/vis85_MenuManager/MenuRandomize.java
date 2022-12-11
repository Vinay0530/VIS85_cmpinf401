package vis85_MenuManager;

import java.util.ArrayList;

public class MenuRandomize 
/**
 * Class MenuRandomize
 * @author : Vinay Sriharish
 * @created: 10/30/2022
 */

{
	private ArrayList<Entree> entrees =  null;
	private ArrayList<Side> sides = null;
	private ArrayList<Salad> salads = null;
	private ArrayList<Dessert> desserts = null;

	/**
	 * Method MenuRandomize
	 * @param entreeFile a String
	 * @param sideFile a String
	 * @param saladFile a String
	 * @param dessertFile a String
	 */


	public MenuRandomize(String entreeFile,String sideFile, String saladFile, String dessertFile)
	{
		entrees=FileManager.readEntrees(entreeFile);
		sides=FileManager.readSides(sideFile);
		salads=FileManager.readSalads(saladFile);
		desserts = FileManager.readDesserts(dessertFile);
	}
	/**
	 * Method randomMenu
	 * @return the new menu
	 */


	public Menu randomMenu()
	{

		int randomEntree=(int)(Math.random()*5);
		int randomSide=(int)(Math.random()*5);
		int randomSalad=(int)(Math.random()*5);
		int randomDesert=(int)(Math.random()*5);




		Menu menu = new Menu("Random Menu", 
				entrees.get(randomEntree),
				sides.get(randomSide),
				salads.get(randomSalad),
				desserts.get(randomDesert));

		return menu;

	}

}
