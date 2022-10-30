package vis85_MenuManager;

/**
 * Class MenuTest
 * author : Vinay Sriharish
 * created: 10/08/2022
 */

public class MenuTest {

	public static void main(String[] args) 
	{


		//Creating 2 entrees 2 sides 1 salad 1 dessert 
		Entree entree = new Entree("Bacon Cheese Burger ", ",Seasoned beef patty with cheese and two strips of baon with chipotle sauce. "
				, 1250);
		Salad salad = new Salad("Ceaser Salad ", ",is a green salad of romaine lettuce and croutons dressed with lemon juice (or lime juice), olive oil, egg, Worcestershire sauce, anchovies, garlic, Dijon mustard, Parmesan cheese, and black pepper.", 
				250);
		Dessert dessert = new Dessert("Choclate Cake ", ",3 layers of cake with choclate frosting", 350);
		Side side = new Side("Curly Fries ", ",made from deep-fried potatoes that have been cut into various curls", 500);

		Entree entree1 = new Entree("Chicken Tenders ", ",Deep fried chicken strips", 750);
		Side side1 = new Side("Bread Sticks ", ",A hard cracker made from bread dough that is formed into long circular disk shape.", 600);

		//Creating menu one with just entree and side 
		Menu menu1 = new Menu("First Menu", entree, side );

		//Creating second menu  with entree side salad dessert
		Menu menu2 = new Menu("Second Menu", entree1, side1, salad, dessert);



		//Printing first menu 
		System.out.println(menu1.description());
		//Space in between menus 
		System.out.println(" ");
		//Printing second menu
		System.out.println(menu2.description());
		
		System.out.println("# Entree count: " + FileManager.readEntrees("data/entrees").size());



	}

}
