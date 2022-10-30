package vis85_MenuManager;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
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
		     Entree entree = new Entree(arrEntree[0],arrEntree[1] , Integer.parseInt(arrEntree[2]));
		     entries.add(entree);
		     
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
		     Side side1 = new Side(arrSide[0],arrSide[1] , Integer.parseInt(arrSide[2]));
		     sides.add(side1);
		     
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
		     Salad salad1 = new Salad(arrSalad[0],arrSalad[1] , Integer.parseInt(arrSalad[2]));
		     salads.add(salad1);
		     
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
		     Dessert dessert1 = new Dessert(arrDessert[0],arrDessert[1] , Integer.parseInt(arrDessert[2]));
		     desserts.add(dessert1);
		     
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
	

}
