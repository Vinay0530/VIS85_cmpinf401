package vis85_MenuManager;

import java.util.ArrayList;

public class MenuTester 
/**
 * Class MenuTester
 * @author : Vinay Sriharish
 * @created: 10/30/2022
 */
{

	public static void main(String[] args) 
	{
		//ArrayList<Menu> entrees = new ArrayList<Menu>();
		//MenuRandomize randomize = new MenuRandomize("data/entrees.txt",
		//		"data/sides.txt","data/salads.txt","data/desserts.txt");
		//Menu myMenu = randomize.randomMenu();
		//System.out.println(myMenu.description()+"\nTotal calories "+
		//	myMenu.totalCalories());


		MenuManager menuManager=new MenuManager("data/dishes.txt");

		Menu randomMenu=menuManager.randomMenu("Menu1");
		ArrayList<Menu> menutest = new ArrayList<Menu>();
		menutest.add(randomMenu);


		FileManager.writeMenu("data/test1.txt", menutest);






	}

}
