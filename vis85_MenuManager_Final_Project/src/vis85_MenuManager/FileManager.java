package vis85_MenuManager;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;


public class FileManager
/**
 * Class FileManager
 * @author : Vinay Sriharish
 * @created: 10/30/2022
 */
{
	/**
	 * Method readEntrees
	 * @param fileName a String
	 * @return the arraylist
	 */

	public static ArrayList<Entree> readEntrees(String fileName)
	{
		ArrayList<Entree> entries = new ArrayList<Entree>();
		FileReader fr;
		try {
			fr = new FileReader(fileName);

			BufferedReader br = new BufferedReader(fr); 
			String line = null;

			while ((line = br.readLine()) != null) {

				String[] arrEntree = line.split("@@");
				//Entree entree = new Entree(arrEntree[0],arrEntree[1] , Integer.parseInt(arrEntree[2]));
				//entries.add(entree);

			}   

			br.close();
			fr.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Entree file is not found. Please create data before you run program.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entries;
	}
	/**
	 * Method readSides
	 * @param fileName a String
	 * @return the arraylist
	 */
	public static ArrayList<Side> readSides(String fileName)
	{
		ArrayList<Side> sides = new ArrayList<Side>();
		FileReader fr;
		try {
			fr = new FileReader(fileName);

			BufferedReader br = new BufferedReader(fr); 
			String line = null;

			while ((line = br.readLine()) != null) {

				String[] arrSide = line.split("@@");
				//	Side side1 = new Side(arrSide[0],arrSide[1] , Integer.parseInt(arrSide[2]));
				//sides.add(side1);

			}   

			br.close();
			fr.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Entree file is not found. Please create data before you run program.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sides;
	}
	/**
	 * Method readSalads
	 * @param fileName a String
	 * @return the arraylist
	 */
	public static ArrayList<Salad> readSalads(String fileName)
	{
		ArrayList<Salad> salads = new ArrayList<Salad>();
		FileReader fr;
		try {
			fr = new FileReader(fileName);

			BufferedReader br = new BufferedReader(fr); 
			String line = null;

			while ((line = br.readLine()) != null) {

				String[] arrSalad = line.split("@@");
				//	Salad salad1 = new Salad(arrSalad[0],arrSalad[1] , Integer.parseInt(arrSalad[2]));
				//	salads.add(salad1);

			}   

			br.close();
			fr.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Entree file is not found. Please create data before you run program.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salads;
	}
	/**
	 * Method readDesserts
	 * @param fileName a String
	 * @return the arraylist
	 */
	public static ArrayList<Dessert> readDesserts(String fileName)
	{
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
		FileReader fr;
		try {
			fr = new FileReader(fileName);

			BufferedReader br = new BufferedReader(fr); 
			String line = null;

			while ((line = br.readLine()) != null) {

				String[] arrDessert = line.split("@@");
				//	Dessert dessert1 = new Dessert(arrDessert[0],arrDessert[1] , Integer.parseInt(arrDessert[2]));
				//	desserts.add(dessert1);

			}   

			br.close();
			fr.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Entree file is not found. Please create data before you run program.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return desserts;
	}


	/*Index:0          index:1          index:2                  index:3   Index:4
	 * name of dish@@type of the dish@@description of the dish@@calories@@price
	 * 
	 */

	/**
	 * Method readItems
	 * @param fileName a string
	 * @return menuItems
	 */

	public static ArrayList<MenuItem> readItems(String fileName)
	{
		ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
		FileReader fr;
		try {
			fr = new FileReader(fileName);

			BufferedReader br = new BufferedReader(fr); 
			String line = null;

			while ((line = br.readLine()) != null) {
				MenuItem menuItem = null;

				String[] arrEntree = line.split("@@");
				if(arrEntree[1].equals("entree"))
				{
					menuItem  = new Entree(arrEntree[0], arrEntree[2],
							Integer.parseInt(arrEntree[3]), Double.parseDouble(arrEntree[4]));

				}
				else if(arrEntree[1].equals("side"))
				{
					menuItem  = new Side(arrEntree[0], arrEntree[2],
							Integer.parseInt(arrEntree[3]), Double.parseDouble(arrEntree[4]));

				}
				else if(arrEntree[1].equals("salad"))
				{
					menuItem  = new Salad(arrEntree[0], arrEntree[2],
							Integer.parseInt(arrEntree[3]), Double.parseDouble(arrEntree[4]));
				}
				else if(arrEntree[1].equals("dessert"))
				{
					menuItem  = new Dessert(arrEntree[0], arrEntree[2],
							Integer.parseInt(arrEntree[3]), Double.parseDouble(arrEntree[4]));
				}


				menuItems.add(menuItem);

			}   

			br.close();
			fr.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Entree file is not found. Please create data before you run program.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return menuItems;
	}
	/**
	 * Method calculate
	 * @param fileName a String
	 * @param menus an ArrayList
	 */


	public static void writeMenu( String fileName, ArrayList<Menu> menus )
	{
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < menus.size(); i++) {
				Menu menu=menus.get(i);
				String menuName=menu.getName();
				String entreeName=menu.getEntree().getName();
				String sideName=menu.getSide().getName();
				String saladName=menu.getSalad().getName();
				String dessertName=menu.getDessert().getName();
				String entreeDescription=menu.getEntree().getDescription();
				String sideDescription=menu.getSide().getDescription();
				String saladDescription=menu.getSalad().getDescription();
				String dessertDescription=menu.getDessert().getDescription();
				int entreeCalories = menu.getEntree().getCalories();
				int sideCalories = menu.getSide().getCalories();
				int saladCalories = menu.getSalad().getCalories();
				int dessertCalories = menu.getDessert().getCalories();
				double entreePrice = menu.getEntree().getPrice();
				double sidePrice = menu.getSide().getPrice();
				double saladPrice = menu.getSalad().getPrice();
				double dessertPrice = menu.getDessert().getPrice();
				int totalCals = entreeCalories + sideCalories + saladCalories + dessertCalories;
				double totalPrice = entreePrice + sidePrice + saladPrice + dessertPrice;

				String menuLine1 = "Menu name " + menuName;
				String menuLine2 = "Entree: " + entreeName + " Calories: " + entreeCalories + " Price: " + entreePrice;
				String menuLine3 = "Side: " + sideName + " Calories: " + sideCalories + " Price: " + sidePrice;
				String menuLine4 = "Salad: " + saladName + " Calories: " + saladCalories + " Price: " + saladPrice;
				String menuLine5 = "Dessert: " + dessertName + " Calories: " + dessertCalories + " Price: " + dessertPrice;
				String menuLine6 = "Total Cals: " + totalCals;
				String menuLine7 = "Total Price " + totalPrice;

				bw.write(menuLine1);
				bw.newLine();
				bw.write(menuLine2);
				bw.newLine();
				bw.write(menuLine3);
				bw.newLine();
				bw.write(menuLine4);
				bw.newLine();
				bw.write(menuLine5);
				bw.newLine();
				bw.write(menuLine6);
				bw.newLine();
				bw.write(menuLine7);



			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}






}
